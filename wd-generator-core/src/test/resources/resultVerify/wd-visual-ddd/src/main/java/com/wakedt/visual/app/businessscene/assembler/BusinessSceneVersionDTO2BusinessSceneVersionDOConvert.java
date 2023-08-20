package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionDTO2BusinessSceneVersionDOConvert extends BaseConvert<BusinessSceneVersionDTO, BusinessSceneVersionDO> {

    BusinessSceneVersionDTO2BusinessSceneVersionDOConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "businessSceneId", target = "businessSceneId")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "businessSceneDsl", target = "businessSceneDsl")
    @Mapping(source = "graphDsl", target = "graphDsl")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    BusinessSceneVersionDO dto2Do(BusinessSceneVersionDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "businessSceneId", target = "businessSceneId")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "businessSceneDsl", target = "businessSceneDsl")
    @Mapping(source = "graphDsl", target = "graphDsl")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    BusinessSceneVersionDTO do2Dto(BusinessSceneVersionDO d);
}