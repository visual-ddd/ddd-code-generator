package com.wakedt.visual.app.application.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.application.assembler.ApplicationVersionDTO2ApplicationVersionDOConvert;
import com.wakedt.visual.client.application.dto.ApplicationVersionDTO;
import com.wakedt.visual.client.application.query.ApplicationVersionQuery;
import com.wakedt.visual.infrastructure.application.repository.mapper.ApplicationVersionMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 应用版本详情查询对象-查询器
 */
@Component
public class ApplicationVersionQueryExe {

    @Resource
    private ApplicationVersionMapper mapper;

    public ResultDTO<ApplicationVersionDTO> execute(ApplicationVersionQuery query) {
        return ResultDTO.success(
                ApplicationVersionDTO2ApplicationVersionDOConvert.INSTANCE.do2Dto(mapper.applicationVersionQuery(query)));
    }
}
