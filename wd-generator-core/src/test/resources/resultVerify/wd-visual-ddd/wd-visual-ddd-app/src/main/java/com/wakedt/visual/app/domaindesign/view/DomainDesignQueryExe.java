package com.wakedt.visual.app.domaindesign.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.domaindesign.query.DomainDesignQuery;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;
import com.wakedt.visual.infrastructure.domaindesign.repository.mapper.DomainDesignMapper;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignDTO;
import com.wakedt.visual.app.domaindesign.assembler.DomainDesignDTO2DomainDesignDOConvert;

/**
 * 业务域详情查询对象-查询器
 */
@Component
public class DomainDesignQueryExe {

    @Resource
    private DomainDesignMapper mapper;

    public ResultDTO<DomainDesignDTO> execute(DomainDesignQuery query) {
        return ResultDTO.success(
                DomainDesignDTO2DomainDesignDOConvert.INSTANCE.do2Dto(mapper.domainDesignQuery(query)));
    }
}
