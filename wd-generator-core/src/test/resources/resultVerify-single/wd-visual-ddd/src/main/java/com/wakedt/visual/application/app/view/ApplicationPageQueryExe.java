package com.wakedt.visual.application.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.application.client.query.ApplicationPageQuery;
import com.wakedt.visual.application.infrastructure.repository.model.ApplicationDO;
import com.wakedt.visual.application.infrastructure.repository.mapper.ApplicationMapper;
import com.wakedt.visual.application.client.dto.ApplicationDTO;
import com.wakedt.visual.application.app.assembler.ApplicationDTO2ApplicationDOConvert;

/**
 * 应用分页查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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
