package dgrubjesic.tri_party.assets.config;

import com.google.protobuf.InvalidProtocolBufferException;
import dgrubjesic.tri_party.proto.AssetRequest;
import org.reactivestreams.Publisher;
import org.springframework.core.ResolvableType;
import org.springframework.core.codec.Decoder;
import org.springframework.core.codec.DecodingException;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@Component
public class AssetDecoder implements Decoder<AssetRequest> {

    @Override
    public boolean canDecode(ResolvableType elementType, MimeType mimeType) {
        return (AssetRequest.class.isAssignableFrom(elementType.toClass()));
    }

    @Override
    public Flux<AssetRequest> decode(Publisher<DataBuffer> inputStream, ResolvableType elementType, MimeType mimeType, Map<String, Object> hints) {
        return Flux.from(inputStream).map(buffer -> {
            try {
                return AssetRequest.parseFrom(buffer.toByteBuffer());
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public Mono<AssetRequest> decodeToMono(Publisher<DataBuffer> inputStream, ResolvableType elementType, MimeType mimeType, Map<String, Object> hints) {
        return Mono.from(inputStream).map(buffer -> {
            try {
                return AssetRequest.parseFrom(buffer.toByteBuffer());
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public List<MimeType> getDecodableMimeTypes() {
        return List.of(MimeTypeUtils.ALL);
    }


    @Override
    public AssetRequest decode(DataBuffer buffer, ResolvableType targetType, MimeType mimeType, Map<String, Object> hints) throws DecodingException {
        try {
            return AssetRequest.parseFrom(buffer.toByteBuffer());
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }
}
