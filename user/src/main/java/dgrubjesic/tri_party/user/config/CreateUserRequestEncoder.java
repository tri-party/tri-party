package dgrubjesic.tri_party.user.config;

import dgrubjesic.tri_party.proto.CreateUserRequest;
import org.reactivestreams.Publisher;
import org.springframework.core.ResolvableType;
import org.springframework.core.codec.Encoder;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;

@Component
public class CreateUserRequestEncoder implements Encoder<CreateUserRequest> {

    @Override
    public DataBuffer encodeValue(CreateUserRequest value, DataBufferFactory bufferFactory, ResolvableType valueType, MimeType mimeType, Map<String, Object> hints) {
        return DefaultDataBufferFactory.sharedInstance.wrap(value.toByteArray());
    }

    @Override
    public List<MimeType> getEncodableMimeTypes(ResolvableType elementType) {
        return Encoder.super.getEncodableMimeTypes(elementType);
    }
    @Override
    public boolean canEncode(ResolvableType elementType, MimeType mimeType) {
        return (CreateUserRequest.class.isAssignableFrom(elementType.toClass()));
    }

    @Override
    public Flux<DataBuffer> encode(Publisher<? extends CreateUserRequest> inputStream, DataBufferFactory bufferFactory, ResolvableType elementType, MimeType mimeType, Map<String, Object> hints) {
        return Flux.from(inputStream).map(s -> DefaultDataBufferFactory.sharedInstance.wrap(s.toByteArray()));
    }

    @Override
    public List<MimeType> getEncodableMimeTypes() {
        return List.of(MimeTypeUtils.ALL);
    }
}
