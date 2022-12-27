package dgrubjesic.tri_party.user.out.adapters;

import dgrubjesic.tri_party.proto.CreateUserResponse;
import dgrubjesic.tri_party.user.domain.User;
import dgrubjesic.tri_party.user.in.UserMapper;
import dgrubjesic.tri_party.user.out.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Profile("local")
@RequiredArgsConstructor
@Service
public class UserAdapterLocal implements UserPort {
    private final UserMapper mapper;
    private final RSocketRequester requester;

    @Override
    public Mono<User> saveUser(User user) {

        return requester.route("hello").data(mapper.map(user)).retrieveMono(CreateUserResponse.class).map(mapper::map);
    }
}
