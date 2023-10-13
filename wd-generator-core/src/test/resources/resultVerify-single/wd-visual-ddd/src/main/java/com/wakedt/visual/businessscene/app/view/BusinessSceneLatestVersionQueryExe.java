package com.wakedt.visual.businessscene.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.businessscene.client.query.BusinessSceneLatestVersionQuery;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.businessscene.infrastructure.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;

/**
 * 应用最新版本查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class BusinessSceneLatestVersionQueryExe {

    @Resource
    private BusinessSceneVersionMapper mapper;

    public ResultDTO<BusinessSceneVersionDTO> execute(BusinessSceneLatestVersionQuery query) {
        return ResultDTO.success(
                BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.INSTANCE.do2Dto(mapper.businessSceneLatestVersionQuery(query)));
    }
}
