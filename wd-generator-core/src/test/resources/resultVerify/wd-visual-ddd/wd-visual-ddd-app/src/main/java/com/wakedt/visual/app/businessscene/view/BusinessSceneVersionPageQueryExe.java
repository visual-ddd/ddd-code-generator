package com.wakedt.visual.app.businessscene.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionPageQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.app.businessscene.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;

/**
 * 业务场景版本分页查询对象-查询器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Component
public class BusinessSceneVersionPageQueryExe {

    @Resource
    private BusinessSceneVersionMapper mapper;

    public PageResultDTO<List<BusinessSceneVersionDTO>> execute(BusinessSceneVersionPageQuery pageQuery) {
        PageMethod.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());

        PageInfo<BusinessSceneVersionDO> pageInfo = new PageInfo<>(mapper.businessSceneVersionPageQuery(pageQuery));
        PageResultDTO<List<BusinessSceneVersionDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
