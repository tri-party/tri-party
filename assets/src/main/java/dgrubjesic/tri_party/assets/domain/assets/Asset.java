package dgrubjesic.tri_party.assets.domain.assets;

import dgrubjesic.tri_party.assets.domain.qualification.Qualification;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.UUID;

@SuperBuilder
public abstract class Asset {
    private final UUID id;
    private final String name;
    private final String description;

    private final List<Qualification> qualifications;
}
