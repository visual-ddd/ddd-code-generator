package com.wakedt.visual.app.businessscene.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.businessscene.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneLatestVersionQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneVersionMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 应用最新版本查询对象-查询器
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
