package song.sj.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemImages is a Querydsl query type for ItemImages
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemImages extends EntityPathBase<ItemImages> {

    private static final long serialVersionUID = -494605864L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemImages itemImages = new QItemImages("itemImages");

    public final song.sj.QTimeStamp _super = new song.sj.QTimeStamp(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imageName = createString("imageName");

    public final ArrayPath<byte[], Byte> images = createArray("images", byte[].class);

    public final StringPath imageType = createString("imageType");

    public final song.sj.entity.item.QItem item;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath serverImageName = createString("serverImageName");

    public QItemImages(String variable) {
        this(ItemImages.class, forVariable(variable), INITS);
    }

    public QItemImages(Path<? extends ItemImages> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemImages(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemImages(PathMetadata metadata, PathInits inits) {
        this(ItemImages.class, metadata, inits);
    }

    public QItemImages(Class<? extends ItemImages> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new song.sj.entity.item.QItem(forProperty("item"), inits.get("item")) : null;
    }

}
