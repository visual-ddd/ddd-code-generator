package com.wakedt.visual.organization.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.organization.client.query.OrganizationPageQuery;
import com.wakedt.visual.organization.infrastructure.repository.model.OrganizationDO;
import com.wakedt.visual.organization.infrastructure.repository.mapper.OrganizationMapper;
import com.wakedt.visual.organization.client.dto.OrganizationDTO;
import com.wakedt.visual.organization.app.assembler.OrganizationDTO2OrganizationDOConvert;

/**
 * 组织分页查询对象-查询器
 */
@Component
public class OrganizationPageQueryExe {

    @Resource
    private OrganizationMapper mapper;

    public PageResultDTO<List<OrganizationDTO>> execute(OrganizationPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<OrganizationDO> pageInfo = new PageInfo<>(mapper.organizationPageQuery(pageQuery));
        PageResultDTO<List<OrganizationDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(OrganizationDTO2OrganizationDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
