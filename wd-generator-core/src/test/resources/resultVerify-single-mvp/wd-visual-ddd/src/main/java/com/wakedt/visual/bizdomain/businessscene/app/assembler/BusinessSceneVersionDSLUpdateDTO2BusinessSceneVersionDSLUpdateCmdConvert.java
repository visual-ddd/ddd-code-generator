package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.dslupdate.BusinessSceneVersionDSLUpdateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert extends BaseConvert<BusinessSceneVersionDSLUpdateDTO, BusinessSceneVersionDSLUpdateCmd> {

    BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert.class);
}