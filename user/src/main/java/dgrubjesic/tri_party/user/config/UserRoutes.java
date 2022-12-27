package dgrubjesic.tri_party.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import dgrubjesic.tri_party.user.in.UserUseCase;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class UserRoutes {

    @Bean
    RouterFunction<ServerResponse> routes(UserUseCase userUseCase) {
        return route(POST("/user").and(accept(MediaType.APPLICATION_JSON)), userUseCase::createUser);
    }
}