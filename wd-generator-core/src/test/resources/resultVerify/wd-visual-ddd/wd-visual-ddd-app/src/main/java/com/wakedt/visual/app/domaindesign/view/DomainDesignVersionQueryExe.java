package com.wakedt.visual.app.domaindesign.view;

import com.wakedata.common.core.dto.ResultDTO;
import lombok.extern.slf4j.Slf4j;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionQuery;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.infrastructure.domaindesign.repository.mapper.DomainDesignVersionMapper;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignVersionDTO;
import com.wakedt.visual.app.domaindesign.assembler.DomainDesignVersionDTO2DomainDesignVersionDOConvert;

/**
 * 业务域版本详情查询对象-查询器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class DomainDesignVersionQueryExe {

    @Resource
    private DomainDesignVersionMapper mapper;

    public ResultDTO<DomainDesignVersionDTO> execute(DomainDesignVersionQuery query) {
        log.info("业务域版本详情查询对象-查询器:{}", query);
        return ResultDTO.success(DomainDesignVersionDTO2DomainDesignVersionDOConvert.INSTANCE.do2Dto(
                mapper.domainDesignVersionQuery(query)
        ));
    }
}
