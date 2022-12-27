package dgrubjesic.tri_party.user_repo.in;

import dgrubjesic.tri_party.proto.CreateUserRequest;
import dgrubjesic.tri_party.proto.CreateUserResponse;
import dgrubjesic.tri_party.user_repo.domain.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserRepoMapper {

    UserInfo map(CreateUserRequest request);

    CreateUserResponse map(UserInfo entity);
}
