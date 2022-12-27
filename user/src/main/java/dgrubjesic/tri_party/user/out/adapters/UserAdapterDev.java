package dgrubjesic.tri_party.user.out.adapters;

import dgrubjesic.tri_party.user.domain.User;
import dgrubjesic.tri_party.user.out.UserPort;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Profile("dev")
@Service
public class UserAdapterDev implements UserPort {
    @Override
    public Mono<User> saveUser(User user) {
        return Mono.just(User.builder()
                .id(UUID.randomUUID())
                .email(user.getEmail())
                .build());
    }
}
