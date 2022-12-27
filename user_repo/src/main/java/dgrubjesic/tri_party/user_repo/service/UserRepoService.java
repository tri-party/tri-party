package dgrubjesic.tri_party.user_repo.service;

import dgrubjesic.tri_party.user_repo.domain.UserInfo;
import dgrubjesic.tri_party.user_repo.in.UserRepoUseCase;
import dgrubjesic.tri_party.user_repo.out.adapter.UserRepoLocal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserRepoService implements UserRepoUseCase {

    private final UserRepoLocal userRepoLocal;

    @Override
    public Mono<UserInfo> saveUser(UserInfo userInfo) {
        return userRepoLocal.save(userInfo);
    }
}
