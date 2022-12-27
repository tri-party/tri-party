package dgrubjesic.tri_party.user.in;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Builder
@Getter
@Jacksonized
public class UserRequest {

    public final String email;
}
