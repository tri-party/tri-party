package dgrubjesic.tri_party.assets.config;

import dgrubjesic.tri_party.assets.domain.mapper.AssetDomainMapper;
import dgrubjesic.tri_party.assets.in.AssetUseCase;
import dgrubjesic.tri_party.proto.AssetRequest;
import dgrubjesic.tri_party.proto.CashAssetResponse;
import dgrubjesic.tri_party.proto.InstrumentAssetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class AssetRepoProtoListener {

    private final AssetUseCase useCase;
    private final AssetDomainMapper mapper;

    @MessageMapping("asset/cash")
    public Mono<CashAssetResponse> getCash(AssetRequest message) {
        return Mono.just(message)
                .flatMap(s -> useCase.getCash(UUID.fromString(s.getId())))
                .map(mapper::map);
    }

    @MessageMapping("asset/instrument")
    public Mono<InstrumentAssetResponse> getInstrument(AssetRequest message) {
        return Mono.just(message)
                .flatMap(s -> useCase.getInstrument(UUID.fromString(s.getId())))
                .map(mapper::map);
    }
}
