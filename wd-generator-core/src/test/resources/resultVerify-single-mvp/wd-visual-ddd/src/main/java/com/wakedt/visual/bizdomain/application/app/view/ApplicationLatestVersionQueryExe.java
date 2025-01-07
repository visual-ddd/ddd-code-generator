package com.wakedt.visual.bizdomain.application.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationLatestVersionQuery;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationVersionDO;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.mapper.ApplicationVersionMapper;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationVersionDTO;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationVersionDTO2ApplicationVersionDOConvert;

/**
 * 应用最新版本查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
