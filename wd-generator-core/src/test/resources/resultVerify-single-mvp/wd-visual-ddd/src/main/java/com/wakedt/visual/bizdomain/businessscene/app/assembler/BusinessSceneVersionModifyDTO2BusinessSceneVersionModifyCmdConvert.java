package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionmodify.BusinessSceneVersionModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert extends BaseConvert<BusinessSceneVersionModifyDTO, BusinessSceneVersionModifyCmd> {

    BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert.class);
}