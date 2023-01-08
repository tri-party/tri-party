package dgrubjesic.tri_party.assets.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.messaging.rsocket.RSocketStrategies;

@Configuration
public class Config {

    @Bean
    public RSocketStrategies rsocketStrategies(AssetDecoder decoder, CashResponseEncoder encoder1,
                                               InstrumentResponseEncoder encoder2) {
        return RSocketStrategies.builder()
                .decoder(decoder)
                .encoder(encoder1, encoder2)
                .dataBufferFactory(new DefaultDataBufferFactory(true))
                .build();
    }
}
