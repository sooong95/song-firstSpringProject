package song.sj.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import song.sj.entity.Member;
import song.sj.entity.Payment;
import song.sj.enums.PaymentStatus;
import song.sj.repository.MemberRepository;
import song.sj.repository.PaymentRepository;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final MemberRepository memberRepository;
    private final MemberService memberService;

    public void deposit(int amount) {

        processTransaction(amount, PaymentStatus.DEPOSIT, true);
    }

    public void withdrawal(int amount) {

        processTransaction(amount, PaymentStatus.WITHDRAWAL, false);
    }

    public void payment(int amount) {

        processTransaction(amount, PaymentStatus.PAYMENT, false);
    }

    private Member getMember() {
        return memberService.getMemberFromJwt();
    }

    public void processTransaction(int amount, PaymentStatus paymentStatus, boolean isDeposit) {

        Member member = getMember();

        if (isDeposit) {
            member.inCreaseBalance(amount);
        } else {
            member.decreaseBalance(amount);
        }

        paymentRepository.save(new Payment(member, paymentStatus, amount));

        if (paymentStatus == PaymentStatus.PAYMENT) {
            member.reward(amount);
        }
        memberRepository.save(member);
    }
}
