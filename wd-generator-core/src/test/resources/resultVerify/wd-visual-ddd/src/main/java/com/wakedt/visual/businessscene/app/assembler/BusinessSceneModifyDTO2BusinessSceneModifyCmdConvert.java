package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.app.cmd.businessscenemodify.BusinessSceneModifyCmd;
import com.wakedt.visual.businessscene.client.query.BusinessSceneModifyDTO;
import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert extends BaseConvert<BusinessSceneModifyDTO, BusinessSceneModifyCmd> {

    BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert.class);
}