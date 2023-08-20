package com.wakedt.visual.app.businessscene.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.businessscene.assembler.BusinessSceneDTO2BusinessSceneDOConvert;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 业务场景详情查询对象-查询器
 */
@Component
public class BusinessSceneQueryExe {

    @Resource
    private BusinessSceneMapper mapper;

    public ResultDTO<BusinessSceneDTO> execute(BusinessSceneQuery query) {
        return ResultDTO.success(
                BusinessSceneDTO2BusinessSceneDOConvert.INSTANCE.do2Dto(mapper.businessSceneQuery(query)));
    }
}
