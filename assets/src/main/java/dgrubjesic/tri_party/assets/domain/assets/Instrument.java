package dgrubjesic.tri_party.assets.domain.assets;

import dgrubjesic.tri_party.assets.domain.qualification.Qualification;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
@Builder
@Getter
public class Instrument {
    private final UUID id;
    private final String name;
    private final String description;
    private final List<Qualification> qualifications;
    private final Long smallestTradableAmount;
    private final Long biggestTradableAmount;

}
