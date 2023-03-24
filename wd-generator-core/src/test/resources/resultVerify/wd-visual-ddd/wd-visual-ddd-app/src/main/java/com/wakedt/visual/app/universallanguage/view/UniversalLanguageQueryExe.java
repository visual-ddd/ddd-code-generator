package com.wakedt.visual.app.universallanguage.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageQuery;
import com.wakedt.visual.infrastructure.universallanguage.repository.model.UniversalLanguageDO;
import com.wakedt.visual.infrastructure.universallanguage.repository.mapper.UniversalLanguageMapper;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;
import com.wakedt.visual.app.universallanguage.assembler.UniversalLanguageDTO2UniversalLanguageDOConvert;

/**
 * 查询统一语言详情-查询器
 */
@Component
public class UniversalLanguageQueryExe {

    @Resource
    private UniversalLanguageMapper mapper;

    public ResultDTO<UniversalLanguageDTO> execute(UniversalLanguageQuery query) {
        return ResultDTO.success(
                UniversalLanguageDTO2UniversalLanguageDOConvert.INSTANCE.do2Dto(mapper.universalLanguageQuery(query)));
    }
}
