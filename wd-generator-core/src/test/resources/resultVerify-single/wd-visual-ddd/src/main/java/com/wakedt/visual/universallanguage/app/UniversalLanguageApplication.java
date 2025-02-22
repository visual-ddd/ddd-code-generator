package com.wakedt.visual.universallanguage.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.universallanguage.client.UniversalLanguageRpcService;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageQuery;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguagePageQuery;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageCreateDTO;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageModifyDTO;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageRemoveDTO;
import com.wakedt.visual.universallanguage.client.dto.UniversalLanguageDTO;
import com.wakedt.visual.universallanguage.app.view.UniversalLanguageQueryExe;
import com.wakedt.visual.universallanguage.app.view.UniversalLanguagePageQueryExe;
import com.wakedt.visual.universallanguage.app.assembler.UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert;
import com.wakedt.visual.universallanguage.app.assembler.UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert;
import com.wakedt.visual.universallanguage.app.assembler.UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert;
import com.wakedt.visual.universallanguage.app.cmd.create.UniversalLanguageCreateCmdHandler;
import com.wakedt.visual.universallanguage.app.cmd.modify.UniversalLanguageModifyCmdHandler;
import com.wakedt.visual.universallanguage.app.cmd.remove.UniversalLanguageRemoveCmdHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 统一语言域
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Service
public class UniversalLanguageApplication {

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


    public ResultDTO<Long> create(UniversalLanguageCreateDTO dto) {
        Long id = universalLanguageCreateCmdHandler.handle(UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> modify(UniversalLanguageModifyDTO dto) {
        universalLanguageModifyCmdHandler.handle(UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> remove(UniversalLanguageRemoveDTO dto) {
        universalLanguageRemoveCmdHandler.handle(UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<UniversalLanguageDTO> universalLanguageQuery(UniversalLanguageQuery query) {
        return universalLanguageQueryExe.execute(query);
    }

    public PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery) {
        return universalLanguagePageQueryExe.execute(pageQuery);
    }
}