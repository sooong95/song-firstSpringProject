package song.sj.repository.query;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import song.sj.entity.ItemImages;

import java.util.List;

import static song.sj.entity.QItemImages.itemImages;
import static song.sj.entity.item.QItem.item;

@RequiredArgsConstructor
public class ItemImageQueryRepositoryImpl implements ItemImageQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<ItemImages> findByItemId(Long id) {

        return jpaQueryFactory
                .selectFrom(itemImages)
                .join(itemImages.item, item)
                .where(itemImages.item.id.eq(id))
                .fetch();
    }
}