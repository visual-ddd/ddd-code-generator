package com.wakedt.visual.domaindesign.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domaindesign.client.query.DomainDesignListQuery;
import com.wakedt.visual.domaindesign.infrastructure.repository.model.DomainDesignDO;
import com.wakedt.visual.domaindesign.infrastructure.repository.mapper.DomainDesignMapper;
import com.wakedt.visual.domaindesign.client.dto.DomainDesignDTO;
import com.wakedt.visual.domaindesign.app.assembler.DomainDesignDTO2DomainDesignDOConvert;

/**
 * 业务域列表查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class DomainDesignListQueryExe {

    @Resource
    private DomainDesignMapper mapper;

    public PageResultDTO<List<DomainDesignDTO>> execute(DomainDesignListQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<DomainDesignDO> pageInfo = new PageInfo<>(mapper.domainDesignListQuery(pageQuery));
        PageResultDTO<List<DomainDesignDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(DomainDesignDTO2DomainDesignDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
