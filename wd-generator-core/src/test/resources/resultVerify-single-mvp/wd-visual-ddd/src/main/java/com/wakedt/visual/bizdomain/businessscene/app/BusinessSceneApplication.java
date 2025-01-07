package com.wakedt.visual.bizdomain.businessscene.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessScenePageQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPageQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneListQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneLatestVersionQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneCreateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneModifyDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneRemoveDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionCreateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionRemoveDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPublishDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionForkDTO;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneDTO;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneVersionDTO;
import com.wakedt.visual.bizdomain.businessscene.app.view.BusinessSceneQueryExe;
import com.wakedt.visual.bizdomain.businessscene.app.view.BusinessScenePageQueryExe;
import com.wakedt.visual.bizdomain.businessscene.app.view.BusinessSceneVersionQueryExe;
import com.wakedt.visual.bizdomain.businessscene.app.view.BusinessSceneVersionPageQueryExe;
import com.wakedt.visual.bizdomain.businessscene.app.view.BusinessSceneListQueryExe;
import com.wakedt.visual.bizdomain.businessscene.app.view.BusinessSceneLatestVersionQueryExe;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businessscenecreate.BusinessSceneCreateCmdHandler;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businessscenemodify.BusinessSceneModifyCmdHandler;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneremove.BusinessSceneRemoveCmdHandler;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversioncreate.BusinessSceneVersionCreateCmdHandler;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionmodify.BusinessSceneVersionModifyCmdHandler;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionremove.BusinessSceneVersionRemoveCmdHandler;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.dslupdate.BusinessSceneVersionDSLUpdateCmdHandler;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionpublish.BusinessSceneVersionPublishCmdHandler;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionfork.BusinessSceneVersionForkCmdHandler;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务场景域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class BusinessSceneApplication {

    private BusinessSceneCreateCmdHandler businessSceneCreateCmdHandler;
    private BusinessSceneModifyCmdHandler businessSceneModifyCmdHandler;
    private BusinessSceneRemoveCmdHandler businessSceneRemoveCmdHandler;
    private BusinessSceneVersionModifyCmdHandler businessSceneVersionModifyCmdHandler;
    private BusinessSceneVersionRemoveCmdHandler businessSceneVersionRemoveCmdHandler;
    private BusinessSceneVersionDSLUpdateCmdHandler businessSceneVersionDSLUpdateCmdHandler;
    private BusinessSceneVersionPublishCmdHandler businessSceneVersionPublishCmdHandler;
    private BusinessSceneVersionForkCmdHandler businessSceneVersionForkCmdHandler;
    private BusinessSceneQueryExe businessSceneQueryExe;
    private BusinessScenePageQueryExe businessScenePageQueryExe;
    private BusinessSceneVersionQueryExe businessSceneVersionQueryExe;
    private BusinessSceneVersionPageQueryExe businessSceneVersionPageQueryExe;
    private BusinessSceneListQueryExe businessSceneListQueryExe;
    private BusinessSceneLatestVersionQueryExe businessSceneLatestVersionQueryExe;


    public ResultDTO<Long> businessSceneCreate(BusinessSceneCreateDTO dto) {
        Long id = businessSceneCreateCmdHandler.handle(BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> businessSceneModify(BusinessSceneModifyDTO dto) {
        businessSceneModifyCmdHandler.handle(BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneRemove(BusinessSceneRemoveDTO dto) {
        businessSceneRemoveCmdHandler.handle(BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneVersionModify(BusinessSceneVersionModifyDTO dto) {
        businessSceneVersionModifyCmdHandler.handle(BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneVersionRemove(BusinessSceneVersionRemoveDTO dto) {
        businessSceneVersionRemoveCmdHandler.handle(BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> dslUpdate(BusinessSceneVersionDSLUpdateDTO dto) {
        businessSceneVersionDSLUpdateCmdHandler.handle(BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneVersionPublish(BusinessSceneVersionPublishDTO dto) {
        businessSceneVersionPublishCmdHandler.handle(BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> businessSceneVersionFork(BusinessSceneVersionForkDTO dto) {
        Long id = businessSceneVersionForkCmdHandler.handle(BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<BusinessSceneDTO> businessSceneQuery(BusinessSceneQuery query) {
        return businessSceneQueryExe.execute(query);
    }

    public PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(BusinessScenePageQuery pageQuery) {
        return businessScenePageQueryExe.execute(pageQuery);
    }

    public ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(BusinessSceneVersionQuery query) {
        return businessSceneVersionQueryExe.execute(query);
    }

    public PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery) {
        return businessSceneVersionPageQueryExe.execute(pageQuery);
    }

    public PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(BusinessSceneListQuery pageQuery) {
        return businessSceneListQueryExe.execute(pageQuery);
    }

    public ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query) {
        return businessSceneLatestVersionQueryExe.execute(query);
    }
}