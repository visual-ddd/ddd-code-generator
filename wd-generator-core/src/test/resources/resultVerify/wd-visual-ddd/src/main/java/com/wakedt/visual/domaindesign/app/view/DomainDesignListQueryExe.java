package com.wakedt.visual.domaindesign.app.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedt.visual.domaindesign.app.assembler.DomainDesignDTO2DomainDesignDOConvert;
import com.wakedt.visual.domaindesign.client.dto.DomainDesignDTO;
import com.wakedt.visual.domaindesign.client.query.DomainDesignListQuery;
import com.wakedt.visual.domaindesign.infrastructure.repository.mapper.DomainDesignMapper;
import com.wakedt.visual.domaindesign.infrastructure.repository.model.DomainDesignDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务域列表查询对象-查询器
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
