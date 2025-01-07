package com.wakedt.visual.bizdomain.domaindesign.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionQuery;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.mapper.DomainDesignVersionMapper;
import com.wakedt.visual.bizdomain.domaindesign.client.response.DomainDesignVersionDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionDTO2DomainDesignVersionDOConvert;

/**
 * 业务域版本详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class DomainDesignVersionQueryExe {

    @Resource
    private DomainDesignVersionMapper mapper;

    public ResultDTO<DomainDesignVersionDTO> execute(DomainDesignVersionQuery query) {
        return ResultDTO.success(
                DomainDesignVersionDTO2DomainDesignVersionDOConvert.INSTANCE.do2Dto(mapper.domainDesignVersionQuery(query)));
    }
}
