package dgrubjesic.tri_party.assets.repo;

import dgrubjesic.tri_party.assets.entities.assets.InstrumentEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface InstrumentRepo extends ReactiveCrudRepository<InstrumentEntity, UUID> {
}
