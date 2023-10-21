package com.wakedt.visual.app.businessscene.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.businessscene.query.BusinessSceneListQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.app.businessscene.assembler.BusinessSceneDTO2BusinessSceneDOConvert;

/**
 * 业务场景列表查询对象-查询器
 *
 * @author shimmer
 * @since 1.0
 */
@Component
public class BusinessSceneListQueryExe {

    @Resource
    private BusinessSceneMapper mapper;

    public PageResultDTO<List<BusinessSceneDTO>> execute(BusinessSceneListQuery pageQuery) {
        PageMethod.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());

        PageInfo<BusinessSceneDO> pageInfo = new PageInfo<>(mapper.businessSceneListQuery(pageQuery));
        PageResultDTO<List<BusinessSceneDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(BusinessSceneDTO2BusinessSceneDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
