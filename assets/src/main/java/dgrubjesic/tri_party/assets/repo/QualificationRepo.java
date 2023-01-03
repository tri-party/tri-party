package dgrubjesic.tri_party.assets.repo;

import dgrubjesic.tri_party.assets.entities.qualifications.QualificationEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface QualificationRepo extends ReactiveCrudRepository<QualificationEntity, String> {
}
