package com.wakedt.visual.app.businessscene.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.app.businessscene.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;

/**
 * 业务场景版本详情查询对象-查询器
 */
@Component
public class BusinessSceneVersionQueryExe {

    @Resource
    private BusinessSceneVersionMapper mapper;

    public ResultDTO<BusinessSceneVersionDTO> execute(BusinessSceneVersionQuery query) {
        return ResultDTO.success(
                BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.INSTANCE.do2Dto(mapper.businessSceneVersionQuery(query)));
    }
}
