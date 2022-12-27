package dgrubjesic.tri_party.user.out;

import dgrubjesic.tri_party.user.domain.User;
import reactor.core.publisher.Mono;

public interface UserPort {

    Mono<User> saveUser(User user);
}
