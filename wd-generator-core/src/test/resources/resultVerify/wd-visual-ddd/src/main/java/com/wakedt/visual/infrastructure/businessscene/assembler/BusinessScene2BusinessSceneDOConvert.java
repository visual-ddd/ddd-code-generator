package com.wakedt.visual.infrastructure.businessscene.assembler;

import com.wakedt.visual.domain.businessscene.businessscene.BusinessScene;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessScene2BusinessSceneDOConvert extends BaseConvert<BusinessScene, BusinessSceneDO> {

    BusinessScene2BusinessSceneDOConvert INSTANCE = Mappers.getMapper(BusinessScene2BusinessSceneDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "description", target = "description")
    @Override
    BusinessSceneDO dto2Do(BusinessScene dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "description", target = "description")
    @Override
    BusinessScene do2Dto(BusinessSceneDO d);
}
