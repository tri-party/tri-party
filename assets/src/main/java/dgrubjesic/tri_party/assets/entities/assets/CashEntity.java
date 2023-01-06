package dgrubjesic.tri_party.assets.entities.assets;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@SuperBuilder
@Getter
public class CashEntity extends AssetEntity {

    private final int decimalPlaces;
    private final BigDecimal smallestTradableAmount;
    private final BigDecimal biggestTradableAmount;

}
