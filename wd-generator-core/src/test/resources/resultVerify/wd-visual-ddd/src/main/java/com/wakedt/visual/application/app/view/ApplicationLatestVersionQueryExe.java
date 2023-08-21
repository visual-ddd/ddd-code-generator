package com.wakedt.visual.application.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.application.app.assembler.ApplicationVersionDTO2ApplicationVersionDOConvert;
import com.wakedt.visual.application.client.dto.ApplicationVersionDTO;
import com.wakedt.visual.application.client.query.ApplicationLatestVersionQuery;
import com.wakedt.visual.application.infrastructure.repository.mapper.ApplicationVersionMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 应用最新版本查询对象-查询器
 */
@Component
public class ApplicationLatestVersionQueryExe {

    @Resource
    private ApplicationVersionMapper mapper;

    public ResultDTO<ApplicationVersionDTO> execute(ApplicationLatestVersionQuery query) {
        return ResultDTO.success(
                ApplicationVersionDTO2ApplicationVersionDOConvert.INSTANCE.do2Dto(mapper.applicationLatestVersionQuery(query)));
    }
}
