package dgrubjesic.tri_party.assets.domain.assets;

import dgrubjesic.tri_party.assets.domain.qualification.Qualification;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Builder
public class Cash {

    private final UUID id;
    private final String name;
    private final String description;
    private final List<Qualification> qualifications;
    private final int decimalPlaces;
    private final BigDecimal smallestTradableAmount;
    private final BigDecimal biggestTradableAmount;

}
