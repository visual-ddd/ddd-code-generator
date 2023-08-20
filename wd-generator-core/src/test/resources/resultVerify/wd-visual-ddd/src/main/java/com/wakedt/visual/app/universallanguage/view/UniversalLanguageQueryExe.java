package com.wakedt.visual.app.universallanguage.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.universallanguage.assembler.UniversalLanguageDTO2UniversalLanguageDOConvert;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageQuery;
import com.wakedt.visual.infrastructure.universallanguage.repository.mapper.UniversalLanguageMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
