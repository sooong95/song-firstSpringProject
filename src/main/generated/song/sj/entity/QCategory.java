package song.sj.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategory is a Querydsl query type for Category
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCategory extends EntityPathBase<ItemCategory> {

    private static final long serialVersionUID = -899264853L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCategory category = new QCategory("category");

    public final song.sj.QTimeStamp _super = new song.sj.QTimeStamp(this);

    public final StringPath categoryName = createString("categoryName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<song.sj.entity.item.Item, song.sj.entity.item.QItem> items = this.<song.sj.entity.item.Item, song.sj.entity.item.QItem>createList("items", song.sj.entity.item.Item.class, song.sj.entity.item.QItem.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final QCategory parent;

    public QCategory(String variable) {
        this(ItemCategory.class, forVariable(variable), INITS);
    }

    public QCategory(Path<? extends ItemCategory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCategory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCategory(PathMetadata metadata, PathInits inits) {
        this(ItemCategory.class, metadata, inits);
    }

    public QCategory(Class<? extends ItemCategory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QCategory(forProperty("parent"), inits.get("parent")) : null;
    }

}

