
package com.wakedt.visual.app.universallanguage;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.universallanguage.UniversalLanguageRpcService;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguagePageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageCreateDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageModifyDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageRemoveDTO;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;
import com.wakedt.visual.app.universallanguage.view.UniversalLanguageQueryExe;
import com.wakedt.visual.app.universallanguage.view.UniversalLanguagePageQueryExe;
import com.wakedt.visual.app.universallanguage.assembler.UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert;
import com.wakedt.visual.app.universallanguage.assembler.UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert;
import com.wakedt.visual.app.universallanguage.assembler.UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert;
import com.wakedt.visual.domain.universallanguage.universallanguage.create.UniversalLanguageCreateCmdHandler;
import com.wakedt.visual.domain.universallanguage.universallanguage.modify.UniversalLanguageModifyCmdHandler;
import com.wakedt.visual.domain.universallanguage.universallanguage.remove.UniversalLanguageRemoveCmdHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 维护系统中统一语言的领域-RPC能力接口实现
 */
@Service
public class UniversalLanguageRpcServiceImpl implements UniversalLanguageRpcService {

    @Resource
    private UniversalLanguageCreateCmdHandler universalLanguageCreateCmdHandler;
    @Resource
    private UniversalLanguageModifyCmdHandler universalLanguageModifyCmdHandler;
    @Resource
    private UniversalLanguageRemoveCmdHandler universalLanguageRemoveCmdHandler;
    @Resource
    private UniversalLanguageQueryExe universalLanguageQueryExe;
    @Resource
    private UniversalLanguagePageQueryExe universalLanguagePageQueryExe;


    @Override
    public ResultDTO<Long> create(UniversalLanguageCreateDTO dto) {
        Long id = universalLanguageCreateCmdHandler.handle(UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> modify(UniversalLanguageModifyDTO dto) {
        universalLanguageModifyCmdHandler.handle(UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> remove(UniversalLanguageRemoveDTO dto) {
        universalLanguageRemoveCmdHandler.handle(UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<UniversalLanguageDTO> universalLanguageQuery(UniversalLanguageQuery query) {
        return universalLanguageQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery) {
        return universalLanguagePageQueryExe.execute(pageQuery);
    }
}