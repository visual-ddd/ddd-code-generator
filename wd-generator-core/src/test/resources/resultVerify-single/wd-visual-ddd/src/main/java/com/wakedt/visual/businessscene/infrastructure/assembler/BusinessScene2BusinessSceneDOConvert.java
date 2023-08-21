package com.wakedt.visual.businessscene.infrastructure.assembler;

import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.businessscene.domain.businessscene.BusinessScene;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneDO;

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
