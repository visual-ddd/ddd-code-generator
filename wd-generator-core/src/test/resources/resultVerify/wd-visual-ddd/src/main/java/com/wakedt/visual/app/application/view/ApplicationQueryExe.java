package com.wakedt.visual.app.application.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.application.assembler.ApplicationDTO2ApplicationDOConvert;
import com.wakedt.visual.client.application.dto.ApplicationDTO;
import com.wakedt.visual.client.application.query.ApplicationQuery;
import com.wakedt.visual.infrastructure.application.repository.mapper.ApplicationMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 应用详情查询对象-查询器
 */
@Component
public class ApplicationQueryExe {

    @Resource
    private ApplicationMapper mapper;

    public ResultDTO<ApplicationDTO> execute(ApplicationQuery query) {
        return ResultDTO.success(
                ApplicationDTO2ApplicationDOConvert.INSTANCE.do2Dto(mapper.applicationQuery(query)));
    }
}
