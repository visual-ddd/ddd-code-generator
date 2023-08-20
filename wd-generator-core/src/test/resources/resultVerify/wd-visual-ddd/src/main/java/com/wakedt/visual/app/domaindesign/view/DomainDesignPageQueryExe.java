package com.wakedt.visual.app.domaindesign.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedt.visual.app.domaindesign.assembler.DomainDesignDTO2DomainDesignDOConvert;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignPageQuery;
import com.wakedt.visual.infrastructure.domaindesign.repository.mapper.DomainDesignMapper;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务域分页查询对象-查询器
 */
@Component
public class DomainDesignPageQueryExe {

    @Resource
    private DomainDesignMapper mapper;

    public PageResultDTO<List<DomainDesignDTO>> execute(DomainDesignPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<DomainDesignDO> pageInfo = new PageInfo<>(mapper.domainDesignPageQuery(pageQuery));
        PageResultDTO<List<DomainDesignDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(DomainDesignDTO2DomainDesignDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
