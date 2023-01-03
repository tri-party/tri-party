package dgrubjesic.tri_party.assets.domain.assets;

import dgrubjesic.tri_party.assets.entities.assets.AssetEntity;
import lombok.Builder;
import lombok.experimental.SuperBuilder;

import java.math.BigInteger;

@SuperBuilder
public class Instrument extends Asset {
    private final BigInteger smallestTradableAmount;
    private final BigInteger biggestTradableAmount;

}
