package com.wakedt.visual.app.businessscene.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.businessscene.query.BusinessSceneLatestVersionQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.app.businessscene.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;

/**
 * 应用最新版本查询对象-查询器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
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
