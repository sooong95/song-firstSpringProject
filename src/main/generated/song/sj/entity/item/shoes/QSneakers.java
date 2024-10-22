package song.sj.entity.item.shoes;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSneakers is a Querydsl query type for Sneakers
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSneakers extends EntityPathBase<Sneakers> {

    private static final long serialVersionUID = -1333575994L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSneakers sneakers = new QSneakers("sneakers");

    public final QShoes _super;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate;

    //inherited
    public final StringPath description;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate;

    //inherited
    public final StringPath material;

    // inherited
    public final song.sj.entity.QMember member;

    // inherited
    public final song.sj.entity.QOrder order;

    //inherited
    public final NumberPath<Integer> size;

    public QSneakers(String variable) {
        this(Sneakers.class, forVariable(variable), INITS);
    }

    public QSneakers(Path<? extends Sneakers> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSneakers(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSneakers(PathMetadata metadata, PathInits inits) {
        this(Sneakers.class, metadata, inits);
    }

    public QSneakers(Class<? extends Sneakers> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QShoes(type, metadata, inits);
        this.createdDate = _super.createdDate;
        this.description = _super.description;
        this.id = _super.id;
        this.lastModifiedDate = _super.lastModifiedDate;
        this.material = _super.material;
        this.member = _super.member;
        this.order = _super.order;
        this.size = _super.size;
    }

}

