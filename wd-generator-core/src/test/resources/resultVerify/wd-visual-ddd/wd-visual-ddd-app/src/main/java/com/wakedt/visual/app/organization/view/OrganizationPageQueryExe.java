package com.wakedt.visual.app.organization.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedt.visual.app.organization.assembler.OrganizationDTO2OrganizationDOConvert;
import com.wakedt.visual.client.organization.dto.OrganizationDTO;
import com.wakedt.visual.client.organization.query.OrganizationPageQuery;
import com.wakedt.visual.infrastructure.organization.repository.mapper.OrganizationMapper;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

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
