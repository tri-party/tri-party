package dgrubjesic.tri_party.assets.repo;

import dgrubjesic.tri_party.assets.entities.qualifications.QualificationEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface QualificationRepo extends ReactiveCrudRepository<QualificationEntity, Long> {
}
