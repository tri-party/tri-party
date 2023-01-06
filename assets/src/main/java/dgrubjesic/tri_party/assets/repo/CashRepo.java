package dgrubjesic.tri_party.assets.repo;

import dgrubjesic.tri_party.assets.entities.assets.CashEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface CashRepo extends ReactiveCrudRepository<CashEntity, UUID> {
}
