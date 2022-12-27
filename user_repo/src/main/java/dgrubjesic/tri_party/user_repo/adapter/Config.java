package dgrubjesic.tri_party.user_repo.adapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.messaging.rsocket.RSocketStrategies;

@Configuration
public class Config {

    @Bean
    public RSocketStrategies rsocketStrategies(CreateUserRequestDecoder decoder, CreateUserResponseEncoder encoder) {
        return RSocketStrategies.builder()
                .decoder(decoder)
                .encoder(encoder)
                .dataBufferFactory(new DefaultDataBufferFactory(true))
                .build();
    }
}
