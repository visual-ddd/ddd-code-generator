package com.wakedt.visual.infrastructure.application.assembler;

import com.wakedt.visual.domain.application.application.Application;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Application2ApplicationDOConvert extends BaseConvert<Application, ApplicationDO> {

    Application2ApplicationDOConvert INSTANCE = Mappers.getMapper(Application2ApplicationDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "packageName", target = "packageName")
    @Mapping(source = "description", target = "description")
    @Override
    ApplicationDO dto2Do(Application dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "packageName", target = "packageName")
    @Mapping(source = "description", target = "description")
    @Override
    Application do2Dto(ApplicationDO d);
}
