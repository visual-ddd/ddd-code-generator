package com.wakedt.visual.application.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.application.client.query.ApplicationQuery;
import com.wakedt.visual.application.infrastructure.repository.model.ApplicationDO;
import com.wakedt.visual.application.infrastructure.repository.mapper.ApplicationMapper;
import com.wakedt.visual.application.client.dto.ApplicationDTO;
import com.wakedt.visual.application.app.assembler.ApplicationDTO2ApplicationDOConvert;

/**
 * 应用详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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
