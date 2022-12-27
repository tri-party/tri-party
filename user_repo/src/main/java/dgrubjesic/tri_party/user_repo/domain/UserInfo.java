package dgrubjesic.tri_party.user_repo.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class UserInfo {

    @Id
    private UUID id;
    private String email;
}
