package com.wakedt.visual.app.domaindesign.view;

import java.util.*;
import java.math.*;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionPageQuery;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.infrastructure.domaindesign.repository.mapper.DomainDesignVersionMapper;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignVersionDTO;
import com.wakedt.visual.app.domaindesign.assembler.DomainDesignVersionDTO2DomainDesignVersionDOConvert;

/**
 * 分页查询业务域版本-查询器
 */
@Component
public class DomainDesignVersionPageQueryExe {

    @Resource
    private DomainDesignVersionMapper mapper;

    public PageResultDTO<List<DomainDesignVersionDTO>> execute(DomainDesignVersionPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<DomainDesignVersionDO> pageInfo = new PageInfo<>(mapper.domainDesignVersionPageQuery(pageQuery));
        PageResultDTO<List<DomainDesignVersionDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(DomainDesignVersionDTO2DomainDesignVersionDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
