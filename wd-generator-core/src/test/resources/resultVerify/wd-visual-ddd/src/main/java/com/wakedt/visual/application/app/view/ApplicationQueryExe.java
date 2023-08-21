package com.wakedt.visual.application.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.application.app.assembler.ApplicationDTO2ApplicationDOConvert;
import com.wakedt.visual.application.client.dto.ApplicationDTO;
import com.wakedt.visual.application.client.query.ApplicationQuery;
import com.wakedt.visual.application.infrastructure.repository.mapper.ApplicationMapper;
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
