package com.wakedt.visual.app.application.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.application.query.ApplicationVersionQuery;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationVersionDO;
import com.wakedt.visual.infrastructure.application.repository.mapper.ApplicationVersionMapper;
import com.wakedt.visual.client.application.dto.ApplicationVersionDTO;
import com.wakedt.visual.app.application.assembler.ApplicationVersionDTO2ApplicationVersionDOConvert;

/**
 * 应用版本详情查询对象-查询器
 *
 * @author shimmer
 * @since 1.0
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
