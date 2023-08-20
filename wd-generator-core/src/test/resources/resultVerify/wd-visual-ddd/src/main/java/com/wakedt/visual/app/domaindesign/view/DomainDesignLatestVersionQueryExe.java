package com.wakedt.visual.app.domaindesign.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.domaindesign.assembler.DomainDesignVersionDTO2DomainDesignVersionDOConvert;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignVersionDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignLatestVersionQuery;
import com.wakedt.visual.infrastructure.domaindesign.repository.mapper.DomainDesignVersionMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 业务域最新版本查询对象-查询器
 */
@Component
public class DomainDesignLatestVersionQueryExe {

    @Resource
    private DomainDesignVersionMapper mapper;

    public ResultDTO<DomainDesignVersionDTO> execute(DomainDesignLatestVersionQuery query) {
        return ResultDTO.success(
                DomainDesignVersionDTO2DomainDesignVersionDOConvert.INSTANCE.do2Dto(mapper.domainDesignLatestVersionQuery(query)));
    }
}
