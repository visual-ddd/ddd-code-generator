package com.wakedt.visual.businessscene.app.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneDTO2BusinessSceneDOConvert;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneDTO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneListQuery;
import com.wakedt.visual.businessscene.infrastructure.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务场景列表查询对象-查询器
 */
@Component
public class BusinessSceneListQueryExe {

    @Resource
    private BusinessSceneMapper mapper;

    public PageResultDTO<List<BusinessSceneDTO>> execute(BusinessSceneListQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<BusinessSceneDO> pageInfo = new PageInfo<>(mapper.businessSceneListQuery(pageQuery));
        PageResultDTO<List<BusinessSceneDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(BusinessSceneDTO2BusinessSceneDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
