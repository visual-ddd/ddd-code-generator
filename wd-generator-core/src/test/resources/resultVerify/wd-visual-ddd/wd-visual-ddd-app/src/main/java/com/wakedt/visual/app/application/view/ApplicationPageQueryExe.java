package com.wakedt.visual.app.application.view;

import java.util.*;
import java.math.*;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.application.query.ApplicationPageQuery;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import com.wakedt.visual.infrastructure.application.repository.mapper.ApplicationMapper;
import com.wakedt.visual.client.application.dto.ApplicationDTO;
import com.wakedt.visual.app.application.assembler.ApplicationDTO2ApplicationDOConvert;

/**
 * 分页查询应用-查询器
 */
@Component
public class ApplicationPageQueryExe {

    @Resource
    private ApplicationMapper mapper;

    public PageResultDTO<List<ApplicationDTO>> execute(ApplicationPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<ApplicationDO> pageInfo = new PageInfo<>(mapper.applicationPageQuery(pageQuery));
        PageResultDTO<List<ApplicationDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(ApplicationDTO2ApplicationDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
