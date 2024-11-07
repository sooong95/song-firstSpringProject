package song.sj.dto.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import song.sj.entity.Category;

import java.util.List;

@Data
@AllArgsConstructor
public class SearchItemDto {

    private String itemName;
    private String categoryName;
    private int size;
    private List<String> imageURL;
}
