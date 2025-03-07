package song.sj.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_shop_id")
    private Long id;

    @JoinColumn(name = "shop_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Shop shop;

    @JoinColumn(name = "order_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    @OneToMany(mappedBy = "orderShop")
    private List<OrderItem> orderItemsList = new ArrayList<>();

    @OneToMany(mappedBy = "orderShop")
    private List<Review> reviewList = new ArrayList<>();

    public static OrderShop createOrderShop(Shop shop) {
        OrderShop orderShop = new OrderShop();
        orderShop.shop = shop;

        return orderShop;
    }

    public void addOrder(Order order) {
        this.order = order;
        order.getOrderShopList().add(this);
    }
}
