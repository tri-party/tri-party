package dgrubjesic.tri_party.assets.repo;

import dgrubjesic.tri_party.assets.entities.assets.InstrumentEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InstrumentRepo extends ReactiveCrudRepository<InstrumentEntity, UUID> {
}
