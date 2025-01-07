package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneModifyDTO;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businessscenemodify.BusinessSceneModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert extends BaseConvert<BusinessSceneModifyDTO, BusinessSceneModifyCmd> {

    BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert.class);
}