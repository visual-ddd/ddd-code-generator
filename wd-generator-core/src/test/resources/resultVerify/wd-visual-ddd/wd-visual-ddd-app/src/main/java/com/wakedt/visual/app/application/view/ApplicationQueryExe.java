package com.wakedt.visual.app.application.view;

import com.wakedata.common.core.dto.ResultDTO;
import lombok.extern.slf4j.Slf4j;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.application.query.ApplicationQuery;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import com.wakedt.visual.infrastructure.application.repository.mapper.ApplicationMapper;
import com.wakedt.visual.client.application.dto.ApplicationDTO;
import com.wakedt.visual.app.application.assembler.ApplicationDTO2ApplicationDOConvert;

/**
 * 应用详情查询对象-查询器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class ApplicationQueryExe {

    @Resource
    private ApplicationMapper mapper;

    public ResultDTO<ApplicationDTO> execute(ApplicationQuery query) {
        log.info("应用详情查询对象-查询器:{}", query);
        return ResultDTO.success(ApplicationDTO2ApplicationDOConvert.INSTANCE.do2Dto(
                mapper.applicationQuery(query)
        ));
    }
}
