package dgrubjesic.tri_party.assets.entities.assets;

import dgrubjesic.tri_party.assets.entities.assets.AssetEntity;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.math.BigInteger;

@SuperBuilder
@Getter
public class InstrumentEntity extends AssetEntity {
    private final BigInteger smallestTradableAmount;
    private final BigInteger biggestTradableAmount;

}
