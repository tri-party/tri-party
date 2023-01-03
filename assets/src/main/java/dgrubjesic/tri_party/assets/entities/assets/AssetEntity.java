package dgrubjesic.tri_party.assets.entities.assets;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder
@Getter
public abstract class AssetEntity {

    private final UUID id;
    private final String name;
    private final String description;

}
