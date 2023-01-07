package dgrubjesic.tri_party.assets.entities.assets;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class AssetEntity {

    private final UUID id;
    private final String name;
    private final String description;

}
