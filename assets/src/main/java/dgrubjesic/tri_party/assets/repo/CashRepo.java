package dgrubjesic.tri_party.assets.repo;

import dgrubjesic.tri_party.assets.entities.assets.CashEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface CashRepo extends ReactiveCrudRepository<CashEntity, UUID> {
}
