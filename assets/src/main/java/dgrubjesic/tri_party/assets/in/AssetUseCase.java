package dgrubjesic.tri_party.assets.in;

import dgrubjesic.tri_party.assets.domain.assets.Cash;
import dgrubjesic.tri_party.assets.domain.assets.Instrument;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface AssetUseCase {

    Mono<Cash> getCash(UUID id);
    Mono<Instrument> getInstrument(UUID id);
}
