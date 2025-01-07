package com.wakedt.visual.bizdomain.businessscene.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionQuery;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneVersionDTO;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;

/**
 * 业务场景版本详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
