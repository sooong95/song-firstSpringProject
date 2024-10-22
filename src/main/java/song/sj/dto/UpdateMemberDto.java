package song.sj.dto;

import jakarta.persistence.Embedded;
import lombok.Data;
import song.sj.TimeStamp;
import song.sj.entity.Address;

@Data
public class UpdateMemberDto extends TimeStamp {

    private String username;

    private String currentPassword;
    private String newPassword;

    @Embedded
    private Address address;
}
