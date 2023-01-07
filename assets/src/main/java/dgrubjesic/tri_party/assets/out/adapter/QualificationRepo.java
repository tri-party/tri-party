package dgrubjesic.tri_party.assets.out.adapter;

import dgrubjesic.tri_party.assets.entities.qualifications.QualificationEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationRepo extends ReactiveCrudRepository<QualificationEntity, Long> {
}
