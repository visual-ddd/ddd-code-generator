package com.wakedt.visual.application.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.application.client.query.ApplicationVersionQuery;
import com.wakedt.visual.application.infrastructure.repository.model.ApplicationVersionDO;
import com.wakedt.visual.application.infrastructure.repository.mapper.ApplicationVersionMapper;
import com.wakedt.visual.application.client.dto.ApplicationVersionDTO;
import com.wakedt.visual.application.app.assembler.ApplicationVersionDTO2ApplicationVersionDOConvert;

/**
 * 应用版本详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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
