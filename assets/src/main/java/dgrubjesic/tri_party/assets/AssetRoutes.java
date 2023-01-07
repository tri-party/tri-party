package dgrubjesic.tri_party.assets;

import dgrubjesic.tri_party.assets.in.AssetUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

public class AssetRoutes {

    @Bean
    RouterFunction<ServerResponse> routes(AssetUseCase useCase) {
        return route(GET("/assets/cashes"), useCase::getCash)
                .andRoute(GET("/assets/instruments"), useCase::getInstrument);
    }
}
