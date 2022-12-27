package dgrubjesic.tri_party.user_repo.out.adapter;

import dgrubjesic.tri_party.user_repo.domain.UserInfo;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

@Profile("local")
public interface UserRepoLocal extends ReactiveCrudRepository<UserInfo, UUID> {
}
