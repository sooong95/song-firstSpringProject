package song.sj.dto.shop;

import lombok.Data;
import song.sj.entity.Wishlist;

import java.util.List;

@Data
public class ShopSearchConditionDto {

    private List<String> shopCategoryName;
    private double grade;
    private int reviewsCount;
    private int wishlistCount;
    private Wishlist wishlist;
}