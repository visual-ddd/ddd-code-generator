package com.wakedt.visual.businessscene.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.businessscene.client.BusinessSceneRpcService;
import com.wakedt.visual.businessscene.client.query.BusinessSceneQuery;
import com.wakedt.visual.businessscene.client.query.BusinessScenePageQuery;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionQuery;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionPageQuery;
import com.wakedt.visual.businessscene.client.query.BusinessSceneListQuery;
import com.wakedt.visual.businessscene.client.query.BusinessSceneLatestVersionQuery;
import com.wakedt.visual.businessscene.client.query.BusinessSceneCreateDTO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneModifyDTO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneRemoveDTO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionCreateDTO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionRemoveDTO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionPublishDTO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionForkDTO;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneDTO;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.businessscene.app.view.BusinessSceneQueryExe;
import com.wakedt.visual.businessscene.app.view.BusinessScenePageQueryExe;
import com.wakedt.visual.businessscene.app.view.BusinessSceneVersionQueryExe;
import com.wakedt.visual.businessscene.app.view.BusinessSceneVersionPageQueryExe;
import com.wakedt.visual.businessscene.app.view.BusinessSceneListQueryExe;
import com.wakedt.visual.businessscene.app.view.BusinessSceneLatestVersionQueryExe;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert;
import com.wakedt.visual.businessscene.app.assembler.BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert;
import com.wakedt.visual.businessscene.app.cmd.businessscenecreate.BusinessSceneCreateCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businessscenemodify.BusinessSceneModifyCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneremove.BusinessSceneRemoveCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversioncreate.BusinessSceneVersionCreateCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionmodify.BusinessSceneVersionModifyCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionremove.BusinessSceneVersionRemoveCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.dslupdate.BusinessSceneVersionDSLUpdateCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionpublish.BusinessSceneVersionPublishCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionfork.BusinessSceneVersionForkCmdHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务场景域
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Service
public class BusinessSceneApplication {

    @Resource
    private BusinessSceneCreateCmdHandler businessSceneCreateCmdHandler;
    @Resource
    private BusinessSceneModifyCmdHandler businessSceneModifyCmdHandler;
    @Resource
    private BusinessSceneRemoveCmdHandler businessSceneRemoveCmdHandler;
    @Resource
    private BusinessSceneVersionModifyCmdHandler businessSceneVersionModifyCmdHandler;
    @Resource
    private BusinessSceneVersionRemoveCmdHandler businessSceneVersionRemoveCmdHandler;
    @Resource
    private BusinessSceneVersionDSLUpdateCmdHandler businessSceneVersionDSLUpdateCmdHandler;
    @Resource
    private BusinessSceneVersionPublishCmdHandler businessSceneVersionPublishCmdHandler;
    @Resource
    private BusinessSceneVersionForkCmdHandler businessSceneVersionForkCmdHandler;
    @Resource
    private BusinessSceneQueryExe businessSceneQueryExe;
    @Resource
    private BusinessScenePageQueryExe businessScenePageQueryExe;
    @Resource
    private BusinessSceneVersionQueryExe businessSceneVersionQueryExe;
    @Resource
    private BusinessSceneVersionPageQueryExe businessSceneVersionPageQueryExe;
    @Resource
    private BusinessSceneListQueryExe businessSceneListQueryExe;
    @Resource
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