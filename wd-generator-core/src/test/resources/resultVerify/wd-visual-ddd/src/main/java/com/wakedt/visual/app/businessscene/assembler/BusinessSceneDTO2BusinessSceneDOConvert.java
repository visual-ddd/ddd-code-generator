package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneDTO2BusinessSceneDOConvert extends BaseConvert<BusinessSceneDTO, BusinessSceneDO> {

    BusinessSceneDTO2BusinessSceneDOConvert INSTANCE = Mappers.getMapper(BusinessSceneDTO2BusinessSceneDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "description", target = "description")
    @Override
    BusinessSceneDO dto2Do(BusinessSceneDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "description", target = "description")
    @Override
    BusinessSceneDTO do2Dto(BusinessSceneDO d);
}