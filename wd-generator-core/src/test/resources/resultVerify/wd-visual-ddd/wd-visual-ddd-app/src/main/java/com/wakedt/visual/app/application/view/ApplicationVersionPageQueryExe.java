package com.wakedt.visual.app.application.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.application.query.ApplicationVersionPageQuery;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationVersionDO;
import com.wakedt.visual.infrastructure.application.repository.mapper.ApplicationVersionMapper;
import com.wakedt.visual.client.application.dto.ApplicationVersionDTO;
import com.wakedt.visual.app.application.assembler.ApplicationVersionDTO2ApplicationVersionDOConvert;

/**
 * 应用版本分页查询对象-查询器
 */
@Component
public class ApplicationVersionPageQueryExe {

    @Resource
    private ApplicationVersionMapper mapper;

    public PageResultDTO<List<ApplicationVersionDTO>> execute(ApplicationVersionPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<ApplicationVersionDO> pageInfo = new PageInfo<>(mapper.applicationVersionPageQuery(pageQuery));
        PageResultDTO<List<ApplicationVersionDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(ApplicationVersionDTO2ApplicationVersionDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
