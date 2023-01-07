package dgrubjesic.tri_party.assets.entities.assets;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class InstrumentEntity {
    private final UUID id;
    private final UUID assetId;
    private final Long smallestTradableAmount;
    private final Long biggestTradableAmount;

}
