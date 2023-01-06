package dgrubjesic.tri_party.assets.entities.join_tables;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class AssetToQualificationEntity {
    private final Long id;
    private final UUID assetId;
    private final Long qualificationId;
}
