package song.sj.dto.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import song.sj.entity.Address;
import song.sj.enums.ItemValue;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopSaveDto {

    private String shopName;
    private String shopDescription;
    private List<ItemValue> mainEvent;

    private Address address;
}
