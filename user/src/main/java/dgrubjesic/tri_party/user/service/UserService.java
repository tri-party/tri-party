package dgrubjesic.tri_party.user.service;

import dgrubjesic.tri_party.user.in.UserMapper;
import dgrubjesic.tri_party.user.in.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import dgrubjesic.tri_party.user.in.UserUseCase;
import dgrubjesic.tri_party.user.out.UserPort;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements UserUseCase {

    private final UserMapper mapper;
    private final UserPort port;

    @Override
    public Mono<ServerResponse> createUser(ServerRequest request) {
        return request.bodyToMono(UserRequest.class)
                .log()
                .map(mapper::map)
                .flatMap(port::saveUser)
                .flatMap(s-> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(s));
    }
}
