package dgrubjesic.tri_party.user_repo.adapter;

import dgrubjesic.tri_party.proto.CreateUserRequest;
import dgrubjesic.tri_party.proto.CreateUserResponse;
import dgrubjesic.tri_party.user_repo.in.UserRepoMapper;
import dgrubjesic.tri_party.user_repo.in.UserRepoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Controller
public class UserRepoProtoListener{

    private final UserRepoUseCase useCase;
    private final UserRepoMapper mapper;

    @MessageMapping("hello")
    public Mono<CreateUserResponse> generateUser(CreateUserRequest message) {
        return Mono.just(message)
                .map(mapper::map)
                .flatMap(useCase::saveUser)
                .map(mapper::map);
    }
}
