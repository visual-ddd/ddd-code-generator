package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneDTO;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneDO;

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