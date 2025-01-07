package com.wakedt.visual.bizdomain.application.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionPageQuery;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationVersionDO;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.mapper.ApplicationVersionMapper;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationVersionDTO;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationVersionDTO2ApplicationVersionDOConvert;

/**
 * 应用版本分页查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
