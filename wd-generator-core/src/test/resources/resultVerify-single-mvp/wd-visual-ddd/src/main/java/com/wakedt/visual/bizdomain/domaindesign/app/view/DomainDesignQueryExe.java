package com.wakedt.visual.bizdomain.domaindesign.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignQuery;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignDO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.mapper.DomainDesignMapper;
import com.wakedt.visual.bizdomain.domaindesign.client.response.DomainDesignDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignDTO2DomainDesignDOConvert;

/**
 * 业务域详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
