package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionmodify.BusinessSceneVersionModifyCmd;
import com.wakedt.visual.businessscene.domain.businesssceneversion.VersionStateConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert extends BaseConvert<BusinessSceneVersionModifyDTO, BusinessSceneVersionModifyCmd> {

    BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert.class);
}