package dgrubjesic.tri_party.assets.entities.mapper;

import dgrubjesic.tri_party.assets.domain.assets.Cash;
import dgrubjesic.tri_party.assets.domain.assets.Instrument;
import dgrubjesic.tri_party.assets.domain.qualification.Qualification;
import dgrubjesic.tri_party.assets.entities.assets.AssetEntity;
import dgrubjesic.tri_party.assets.entities.assets.CashEntity;
import dgrubjesic.tri_party.assets.entities.assets.InstrumentEntity;
import dgrubjesic.tri_party.assets.entities.qualifications.QualificationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AssetEntityMapper {

    @Mapping(target = "id", source = "assetEntity.id")
    Cash map(CashEntity entity, List<QualificationEntity> qualifications, AssetEntity assetEntity);

    @Mapping(target = "id", source = "assetEntity.id")
    Instrument map(InstrumentEntity entity, List<QualificationEntity> qualifications, AssetEntity assetEntity);

    Qualification map(QualificationEntity entity);
}
