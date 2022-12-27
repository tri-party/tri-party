package dgrubjesic.tri_party.user.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.messaging.rsocket.RSocketStrategies;
import reactor.util.retry.Retry;

import java.time.Duration;

@Configuration
public class Config {

    @Bean
    public RSocketRequester getRSocketRequester(CreateUserResponseDecoder decoder, CreateUserRequestEncoder encoder){
        RSocketRequester.Builder builder = RSocketRequester.builder();

        return builder
                .rsocketConnector(
                        rSocketConnector ->
                                rSocketConnector.reconnect(Retry.fixedDelay(2, Duration.ofSeconds(2)))
                )
                .rsocketStrategies(RSocketStrategies.builder()
                        .encoder(encoder)
                        .decoder(decoder)
                        .build())
                .tcp("localhost", 7878);
    }
}
