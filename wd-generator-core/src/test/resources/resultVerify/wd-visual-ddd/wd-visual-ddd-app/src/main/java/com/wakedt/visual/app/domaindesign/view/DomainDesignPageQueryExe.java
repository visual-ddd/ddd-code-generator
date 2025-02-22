package com.wakedt.visual.app.domaindesign.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.domaindesign.query.DomainDesignPageQuery;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;
import com.wakedt.visual.infrastructure.domaindesign.repository.mapper.DomainDesignMapper;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignDTO;
import com.wakedt.visual.app.domaindesign.assembler.DomainDesignDTO2DomainDesignDOConvert;

/**
 * 业务域分页查询对象-查询器
 *
 * @author shimmer
 * @since 1.0
 */
@Component
public class DomainDesignPageQueryExe {

    @Resource
    private DomainDesignMapper mapper;

    public PageResultDTO<List<DomainDesignDTO>> execute(DomainDesignPageQuery pageQuery) {
        PageMethod.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());

        PageInfo<DomainDesignDO> pageInfo = new PageInfo<>(mapper.domainDesignPageQuery(pageQuery));
        PageResultDTO<List<DomainDesignDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(DomainDesignDTO2DomainDesignDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
