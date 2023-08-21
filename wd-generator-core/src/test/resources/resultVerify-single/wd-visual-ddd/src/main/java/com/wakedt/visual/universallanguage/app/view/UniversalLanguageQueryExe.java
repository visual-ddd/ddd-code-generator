package com.wakedt.visual.universallanguage.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageQuery;
import com.wakedt.visual.universallanguage.infrastructure.repository.model.UniversalLanguageDO;
import com.wakedt.visual.universallanguage.infrastructure.repository.mapper.UniversalLanguageMapper;
import com.wakedt.visual.universallanguage.client.dto.UniversalLanguageDTO;
import com.wakedt.visual.universallanguage.app.assembler.UniversalLanguageDTO2UniversalLanguageDOConvert;

/**
 * 统一语言详情查询对象-查询器
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
