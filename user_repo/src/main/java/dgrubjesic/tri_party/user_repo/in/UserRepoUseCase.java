package dgrubjesic.tri_party.user_repo.in;

import dgrubjesic.tri_party.user_repo.domain.UserInfo;
import reactor.core.publisher.Mono;

public interface UserRepoUseCase {

    Mono<UserInfo> saveUser(UserInfo userInfo);
}
