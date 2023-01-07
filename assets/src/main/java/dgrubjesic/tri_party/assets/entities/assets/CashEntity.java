package dgrubjesic.tri_party.assets.entities.assets;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Getter
public class CashEntity {

    private final UUID id;
    private final UUID assetId;
    private final int decimalPlaces;
    private final BigDecimal smallestTradableAmount;
    private final BigDecimal biggestTradableAmount;

}
