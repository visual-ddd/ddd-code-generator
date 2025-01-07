package com.wakedt.visual.bizdomain.universallanguage.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageModifyDTO;
import com.wakedt.visual.bizdomain.universallanguage.app.cmd.modify.UniversalLanguageModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert extends BaseConvert<UniversalLanguageModifyDTO, UniversalLanguageModifyCmd> {

    UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert.class);
}