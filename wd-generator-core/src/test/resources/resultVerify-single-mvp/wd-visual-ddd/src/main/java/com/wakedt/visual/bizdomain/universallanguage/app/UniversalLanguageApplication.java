package com.wakedt.visual.bizdomain.universallanguage.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageQuery;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguagePageQuery;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageCreateDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageModifyDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageRemoveDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.response.UniversalLanguageDTO;
import com.wakedt.visual.bizdomain.universallanguage.app.view.UniversalLanguageQueryExe;
import com.wakedt.visual.bizdomain.universallanguage.app.view.UniversalLanguagePageQueryExe;
import com.wakedt.visual.bizdomain.universallanguage.app.assembler.UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert;
import com.wakedt.visual.bizdomain.universallanguage.app.assembler.UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert;
import com.wakedt.visual.bizdomain.universallanguage.app.assembler.UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert;
import com.wakedt.visual.bizdomain.universallanguage.app.cmd.create.UniversalLanguageCreateCmdHandler;
import com.wakedt.visual.bizdomain.universallanguage.app.cmd.modify.UniversalLanguageModifyCmdHandler;
import com.wakedt.visual.bizdomain.universallanguage.app.cmd.remove.UniversalLanguageRemoveCmdHandler;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 统一语言域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class UniversalLanguageApplication {

    private UniversalLanguageCreateCmdHandler universalLanguageCreateCmdHandler;
    private UniversalLanguageModifyCmdHandler universalLanguageModifyCmdHandler;
    private UniversalLanguageRemoveCmdHandler universalLanguageRemoveCmdHandler;
    private UniversalLanguageQueryExe universalLanguageQueryExe;
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