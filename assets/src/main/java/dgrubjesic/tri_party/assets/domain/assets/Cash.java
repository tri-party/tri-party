package dgrubjesic.tri_party.assets.domain.assets;

import dgrubjesic.tri_party.assets.entities.assets.AssetEntity;
import lombok.Builder;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@SuperBuilder
public class Cash extends Asset {

    private final int decimalPlaces;
    private final BigDecimal smallestTradableAmount;
    private final BigDecimal biggestTradableAmount;

}
