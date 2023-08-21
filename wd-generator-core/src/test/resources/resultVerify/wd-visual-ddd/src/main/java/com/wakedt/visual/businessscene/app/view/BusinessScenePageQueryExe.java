package com.wakedt.visual.businessscene.app.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneDTO2BusinessSceneDOConvert;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneDTO;
import com.wakedt.visual.businessscene.client.query.BusinessScenePageQuery;
import com.wakedt.visual.businessscene.infrastructure.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务场景分页查询对象-查询器
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
