package dgrubjesic.tri_party.assets.entities.qualifications;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class QualificationEntity {
    private final Long id;
    private final String key;
    private final String value;
}
