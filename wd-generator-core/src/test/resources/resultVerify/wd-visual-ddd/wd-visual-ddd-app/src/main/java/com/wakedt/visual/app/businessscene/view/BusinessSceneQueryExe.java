package com.wakedt.visual.app.businessscene.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.businessscene.query.BusinessSceneQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.app.businessscene.assembler.BusinessSceneDTO2BusinessSceneDOConvert;

/**
 * 业务场景详情查询对象-查询器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
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
