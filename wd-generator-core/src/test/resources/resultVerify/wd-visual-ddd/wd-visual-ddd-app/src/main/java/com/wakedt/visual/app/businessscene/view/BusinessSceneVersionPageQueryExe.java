package com.wakedt.visual.app.businessscene.view;

import java.util.*;
import java.math.*;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionPageQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.app.businessscene.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;

/**
 * 分页查询业务场景版本-查询器
 */
@Component
public class BusinessSceneVersionPageQueryExe {

    @Resource
    private BusinessSceneVersionMapper mapper;

    public PageResultDTO<List<BusinessSceneVersionDTO>> execute(BusinessSceneVersionPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<BusinessSceneVersionDO> pageInfo = new PageInfo<>(mapper.businessSceneVersionPageQuery(pageQuery));
        PageResultDTO<List<BusinessSceneVersionDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
