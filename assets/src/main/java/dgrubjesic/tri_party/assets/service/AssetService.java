package dgrubjesic.tri_party.assets.service;


import dgrubjesic.tri_party.assets.domain.assets.Cash;
import dgrubjesic.tri_party.assets.domain.assets.Instrument;
import dgrubjesic.tri_party.assets.domain.mapper.AssetMapper;
import dgrubjesic.tri_party.assets.entities.join_tables.AssetToQualificationEntity;
import dgrubjesic.tri_party.assets.in.AssetUseCase;
import dgrubjesic.tri_party.assets.repo.AssetToQualificationRepo;
import dgrubjesic.tri_party.assets.repo.CashRepo;
import dgrubjesic.tri_party.assets.repo.InstrumentRepo;
import dgrubjesic.tri_party.assets.repo.QualificationRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class AssetService implements AssetUseCase {

    private final AssetToQualificationRepo assetToQualificationRepo;
    private final QualificationRepo qualificationRepo;
    private final CashRepo cashRepo;
    private final InstrumentRepo instrumentRepo;
    private final AssetMapper mapper;


    @Override
    public Mono<Cash> getCash(UUID uuid) {
        var qualifications = assetToQualificationRepo.findAllByAssetId(uuid)
                .map(AssetToQualificationEntity::getQualificationId)
                .collectList()
                .map(qualificationRepo::findAllById);
        return cashRepo.findById(uuid).zipWith(qualifications)
                .flatMap( t -> t.getT2().collectList().map(s -> mapper.map(t.getT1(), s)));
    }

    @Override
    public Mono<Instrument> getInstrument(UUID uuid) {
        var qualifications = assetToQualificationRepo.findAllByAssetId(uuid)
                .map(AssetToQualificationEntity::getQualificationId)
                .collectList()
                .map(qualificationRepo::findAllById);
        return instrumentRepo.findById(uuid).zipWith(qualifications)
                .flatMap( t -> t.getT2().collectList().map(s -> mapper.map(t.getT1(), s)));
    }
}
