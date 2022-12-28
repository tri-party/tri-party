package dgrubjesic.tri_party.user.in;


import dgrubjesic.tri_party.proto.CreateUserRequest;
import dgrubjesic.tri_party.proto.CreateUserResponse;
import dgrubjesic.tri_party.user.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    User map(UserRequest request);

    CreateUserRequest map(User user);

    User map(CreateUserResponse response);
}
