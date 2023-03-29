package com.wakedt.visual.app.businessscene.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.businessscene.query.BusinessSceneListQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.app.businessscene.assembler.BusinessSceneDTO2BusinessSceneDOConvert;

/**
 * 业务场景列表查询对象-查询器
 */
@Component
public class BusinessSceneListQueryExe {

    @Resource
    private BusinessSceneMapper mapper;

    public ResultDTO<List<BusinessSceneDTO>> execute(BusinessSceneListQuery query) {
        return ResultDTO.success(
                BusinessSceneDTO2BusinessSceneDOConvert.INSTANCE.do2Dto(mapper.businessSceneListQuery(query)));
    }
}
