package com.wakedt.visual.businessscene.infrastructure.assembler;

import com.wakedt.visual.businessscene.domain.businesssceneversion.BusinessSceneVersion;
import com.wakedt.visual.businessscene.domain.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersion2BusinessSceneVersionDOConvert extends BaseConvert<BusinessSceneVersion, BusinessSceneVersionDO> {

    BusinessSceneVersion2BusinessSceneVersionDOConvert INSTANCE = Mappers.getMapper(BusinessSceneVersion2BusinessSceneVersionDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "businessSceneId", target = "businessSceneId")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "businessSceneDsl", target = "businessSceneDsl")
    @Mapping(source = "graphDsl", target = "graphDsl")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    BusinessSceneVersionDO dto2Do(BusinessSceneVersion dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "businessSceneId", target = "businessSceneId")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "businessSceneDsl", target = "businessSceneDsl")
    @Mapping(source = "graphDsl", target = "graphDsl")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    BusinessSceneVersion do2Dto(BusinessSceneVersionDO d);
}
