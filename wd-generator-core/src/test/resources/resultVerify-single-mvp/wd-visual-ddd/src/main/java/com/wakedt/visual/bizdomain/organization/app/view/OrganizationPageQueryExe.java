package com.wakedt.visual.bizdomain.organization.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationPageQuery;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.OrganizationDO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.mapper.OrganizationMapper;
import com.wakedt.visual.bizdomain.organization.client.response.OrganizationDTO;
import com.wakedt.visual.bizdomain.organization.app.assembler.OrganizationDTO2OrganizationDOConvert;

/**
 * 组织分页查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
