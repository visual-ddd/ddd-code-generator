package com.wakedt.visual.app.application.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.application.query.ApplicationListQuery;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import com.wakedt.visual.infrastructure.application.repository.mapper.ApplicationMapper;
import com.wakedt.visual.client.application.dto.ApplicationDTO;
import com.wakedt.visual.app.application.assembler.ApplicationDTO2ApplicationDOConvert;

/**
 * 应用列表查询对象-查询器
 *
 * @author shimmer
 * @since 1.0
 */
@Component
public class ApplicationListQueryExe {

    @Resource
    private ApplicationMapper mapper;

    public PageResultDTO<List<ApplicationDTO>> execute(ApplicationListQuery pageQuery) {
        PageMethod.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());

        PageInfo<ApplicationDO> pageInfo = new PageInfo<>(mapper.applicationListQuery(pageQuery));
        PageResultDTO<List<ApplicationDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(ApplicationDTO2ApplicationDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
