package dgrubjesic.tri_party.assets.entities.assets;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class InstrumentEntity extends AssetEntity {
    private final Long smallestTradableAmount;
    private final Long biggestTradableAmount;

}
