package com.wakedt.visual.businessscene.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionQuery;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.businessscene.infrastructure.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;

/**
 * 业务场景版本详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
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
