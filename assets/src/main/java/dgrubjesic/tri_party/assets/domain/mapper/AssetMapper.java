package dgrubjesic.tri_party.assets.domain.mapper;

import dgrubjesic.tri_party.assets.domain.assets.Cash;
import dgrubjesic.tri_party.assets.domain.assets.Instrument;
import dgrubjesic.tri_party.assets.domain.qualification.Qualification;
import dgrubjesic.tri_party.assets.entities.assets.CashEntity;
import dgrubjesic.tri_party.assets.entities.assets.InstrumentEntity;
import dgrubjesic.tri_party.assets.entities.qualifications.QualificationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AssetMapper {

    Cash map(CashEntity entity, List<QualificationEntity> qualifications);
    Instrument map(InstrumentEntity entity, List<QualificationEntity> qualifications);
    Qualification map(QualificationEntity entity);
}
