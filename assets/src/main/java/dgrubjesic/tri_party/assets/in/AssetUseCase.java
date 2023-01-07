package dgrubjesic.tri_party.assets.in;

import dgrubjesic.tri_party.assets.domain.assets.Cash;
import dgrubjesic.tri_party.assets.domain.assets.Instrument;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface AssetUseCase {

    Mono<ServerResponse> getCash(ServerRequest serverRequest);
    Mono<ServerResponse> getInstrument(ServerRequest serverRequest);
}
