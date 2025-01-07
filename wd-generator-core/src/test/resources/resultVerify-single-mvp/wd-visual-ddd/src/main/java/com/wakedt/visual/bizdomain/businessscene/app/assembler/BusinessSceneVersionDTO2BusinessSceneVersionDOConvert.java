package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneVersionDTO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionDTO2BusinessSceneVersionDOConvert extends BaseConvert<BusinessSceneVersionDTO, BusinessSceneVersionDO> {

    BusinessSceneVersionDTO2BusinessSceneVersionDOConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.class);

}