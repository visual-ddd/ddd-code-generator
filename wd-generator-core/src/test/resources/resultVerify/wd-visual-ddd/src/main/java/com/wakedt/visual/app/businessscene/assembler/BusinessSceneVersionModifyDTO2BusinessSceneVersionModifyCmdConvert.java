package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify.BusinessSceneVersionModifyCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert extends BaseConvert<BusinessSceneVersionModifyDTO, BusinessSceneVersionModifyCmd> {

    BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert.class);
}