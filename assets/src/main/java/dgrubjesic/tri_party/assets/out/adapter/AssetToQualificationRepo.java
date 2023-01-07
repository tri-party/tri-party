package dgrubjesic.tri_party.assets.out.adapter;

import dgrubjesic.tri_party.assets.entities.join_tables.AssetToQualificationEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.util.UUID;

public interface AssetToQualificationRepo extends ReactiveCrudRepository<AssetToQualificationEntity, Long> {

    Flux<AssetToQualificationEntity> findAllByAssetId(UUID uuid);
}
