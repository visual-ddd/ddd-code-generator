package com.wakedt.visual.businessscene.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.businessscene.client.query.BusinessSceneQuery;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneDO;
import com.wakedt.visual.businessscene.infrastructure.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneDTO;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneDTO2BusinessSceneDOConvert;

/**
 * 业务场景详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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
