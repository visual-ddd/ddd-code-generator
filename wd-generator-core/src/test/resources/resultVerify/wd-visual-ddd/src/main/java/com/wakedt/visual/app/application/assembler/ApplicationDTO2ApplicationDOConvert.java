package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.client.application.dto.ApplicationDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationDTO2ApplicationDOConvert extends BaseConvert<ApplicationDTO, ApplicationDO> {

    ApplicationDTO2ApplicationDOConvert INSTANCE = Mappers.getMapper(ApplicationDTO2ApplicationDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "packageName", target = "packageName")
    @Mapping(source = "description", target = "description")
    @Override
    ApplicationDO dto2Do(ApplicationDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "packageName", target = "packageName")
    @Mapping(source = "description", target = "description")
    @Override
    ApplicationDTO do2Dto(ApplicationDO d);
}