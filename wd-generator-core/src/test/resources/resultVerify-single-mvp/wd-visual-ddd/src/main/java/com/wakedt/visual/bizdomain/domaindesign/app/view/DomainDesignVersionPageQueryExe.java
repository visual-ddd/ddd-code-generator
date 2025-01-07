package com.wakedt.visual.bizdomain.domaindesign.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionPageQuery;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.mapper.DomainDesignVersionMapper;
import com.wakedt.visual.bizdomain.domaindesign.client.response.DomainDesignVersionDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionDTO2DomainDesignVersionDOConvert;

/**
 * 业务域版本分页查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
