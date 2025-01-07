package com.wakedt.visual.bizdomain.businessscene.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPageQuery;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneVersionDTO;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;

/**
 * 业务场景版本分页查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
