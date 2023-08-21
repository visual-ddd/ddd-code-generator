package com.wakedt.visual.domaindesign.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.domaindesign.app.assembler.DomainDesignVersionDTO2DomainDesignVersionDOConvert;
import com.wakedt.visual.domaindesign.client.dto.DomainDesignVersionDTO;
import com.wakedt.visual.domaindesign.client.query.DomainDesignLatestVersionQuery;
import com.wakedt.visual.domaindesign.infrastructure.repository.mapper.DomainDesignVersionMapper;
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
