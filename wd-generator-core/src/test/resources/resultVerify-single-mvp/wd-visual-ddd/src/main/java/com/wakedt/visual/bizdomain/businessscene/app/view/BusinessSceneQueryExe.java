package com.wakedt.visual.bizdomain.businessscene.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneQuery;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneDO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneDTO;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneDTO2BusinessSceneDOConvert;

/**
 * 业务场景详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
