package song.sj.entity.item;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItem is a Querydsl query type for Item
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItem extends EntityPathBase<Item> {

    private static final long serialVersionUID = 725034305L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItem item = new QItem("item");

    public final song.sj.QTimeStamp _super = new song.sj.QTimeStamp(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final StringPath design = createString("design");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<song.sj.entity.ItemBill, song.sj.entity.QItemBill> itemBillList = this.<song.sj.entity.ItemBill, song.sj.entity.QItemBill>createList("itemBillList", song.sj.entity.ItemBill.class, song.sj.entity.QItemBill.class, PathInits.DIRECT2);

    public final song.sj.entity.QItemCategory itemCategory;

    public final ListPath<song.sj.entity.ItemImages, song.sj.entity.QItemImages> itemImages = this.<song.sj.entity.ItemImages, song.sj.entity.QItemImages>createList("itemImages", song.sj.entity.ItemImages.class, song.sj.entity.QItemImages.class, PathInits.DIRECT2);

    public final StringPath itemName = createString("itemName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath material = createString("material");

    public final song.sj.entity.QMember member;

    public final song.sj.entity.QOrderItem orderItem;

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final NumberPath<Integer> size = createNumber("size", Integer.class);

    public QItem(String variable) {
        this(Item.class, forVariable(variable), INITS);
    }

    public QItem(Path<? extends Item> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItem(PathMetadata metadata, PathInits inits) {
        this(Item.class, metadata, inits);
    }

    public QItem(Class<? extends Item> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.itemCategory = inits.isInitialized("itemCategory") ? new song.sj.entity.QItemCategory(forProperty("itemCategory"), inits.get("itemCategory")) : null;
        this.member = inits.isInitialized("member") ? new song.sj.entity.QMember(forProperty("member"), inits.get("member")) : null;
        this.orderItem = inits.isInitialized("orderItem") ? new song.sj.entity.QOrderItem(forProperty("orderItem"), inits.get("orderItem")) : null;
    }

}

