package dgrubjesic.tri_party.assets.domain.mapper;

import com.google.protobuf.ByteString;
import dgrubjesic.tri_party.assets.domain.assets.Cash;
import dgrubjesic.tri_party.assets.domain.assets.Instrument;
import dgrubjesic.tri_party.proto.BDecimal;
import dgrubjesic.tri_party.proto.CashAssetResponse;
import dgrubjesic.tri_party.proto.InstrumentAssetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.math.BigDecimal;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AssetDomainMapper {
    CashAssetResponse map(Cash cash);
    InstrumentAssetResponse map(Instrument instrument);

    default BDecimal map(BigDecimal value) {
        return BDecimal.newBuilder()
                .setScale(value.scale())
                .setPrecision(value.precision())
                .setValue(ByteString.copyFrom(value.unscaledValue().toByteArray()))
                .build();
    }
}
