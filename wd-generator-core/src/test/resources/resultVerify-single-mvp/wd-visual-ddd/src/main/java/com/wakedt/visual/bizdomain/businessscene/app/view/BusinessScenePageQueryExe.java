package com.wakedt.visual.bizdomain.businessscene.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessScenePageQuery;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneDO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneDTO;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneDTO2BusinessSceneDOConvert;

/**
 * 业务场景分页查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class BusinessScenePageQueryExe {

    @Resource
    private BusinessSceneMapper mapper;

    public PageResultDTO<List<BusinessSceneDTO>> execute(BusinessScenePageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<BusinessSceneDO> pageInfo = new PageInfo<>(mapper.businessScenePageQuery(pageQuery));
        PageResultDTO<List<BusinessSceneDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(BusinessSceneDTO2BusinessSceneDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
