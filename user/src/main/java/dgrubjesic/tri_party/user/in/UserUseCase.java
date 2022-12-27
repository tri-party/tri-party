package dgrubjesic.tri_party.user.in;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface UserUseCase {

    Mono<ServerResponse> createUser(ServerRequest request);
}
