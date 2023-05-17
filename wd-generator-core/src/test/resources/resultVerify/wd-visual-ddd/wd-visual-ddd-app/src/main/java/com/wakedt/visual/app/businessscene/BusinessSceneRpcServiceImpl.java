package com.wakedt.visual.app.businessscene;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.businessscene.assembler.*;
import com.wakedt.visual.app.businessscene.view.*;
import com.wakedt.visual.client.businessscene.BusinessSceneRpcService;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.client.businessscene.query.*;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate.BusinessSceneCreateCmdHandler;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify.BusinessSceneModifyCmdHandler;
import com.wakedt.visual.domain.businessscene.businessscene.businesssceneremove.BusinessSceneRemoveCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate.BusinessSceneVersionCreateCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionfork.BusinessSceneVersionForkCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify.BusinessSceneVersionModifyCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish.BusinessSceneVersionPublishCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionremove.BusinessSceneVersionRemoveCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate.BusinessSceneVersionDSLUpdateCmdHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务场景域-RPC能力接口实现
 */
@Service
public class BusinessSceneRpcServiceImpl implements BusinessSceneRpcService {

    @Resource
    private BusinessSceneCreateCmdHandler businessSceneCreateCmdHandler;
    @Resource
    private BusinessSceneModifyCmdHandler businessSceneModifyCmdHandler;
    @Resource
    private BusinessSceneRemoveCmdHandler businessSceneRemoveCmdHandler;
    @Resource
    private BusinessSceneVersionCreateCmdHandler businessSceneVersionCreateCmdHandler;
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


    @Override
    public ResultDTO<Long> businessSceneCreate(BusinessSceneCreateDTO dto) {
        Long id = businessSceneCreateCmdHandler.handle(BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> businessSceneModify(BusinessSceneModifyDTO dto) {
        businessSceneModifyCmdHandler.handle(BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> businessSceneRemove(BusinessSceneRemoveDTO dto) {
        businessSceneRemoveCmdHandler.handle(BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Long> businessSceneVersionCreate(BusinessSceneVersionCreateDTO dto) {
        Long id = businessSceneVersionCreateCmdHandler.handle(BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> businessSceneVersionModify(BusinessSceneVersionModifyDTO dto) {
        businessSceneVersionModifyCmdHandler.handle(BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> businessSceneVersionRemove(BusinessSceneVersionRemoveDTO dto) {
        businessSceneVersionRemoveCmdHandler.handle(BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> dslUpdate(BusinessSceneVersionDSLUpdateDTO dto) {
        businessSceneVersionDSLUpdateCmdHandler.handle(BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> businessSceneVersionPublish(BusinessSceneVersionPublishDTO dto) {
        businessSceneVersionPublishCmdHandler.handle(BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Long> businessSceneVersionFork(BusinessSceneVersionForkDTO dto) {
        Long id = businessSceneVersionForkCmdHandler.handle(BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<BusinessSceneDTO> businessSceneQuery(BusinessSceneQuery query) {
        return businessSceneQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(BusinessScenePageQuery pageQuery) {
        return businessScenePageQueryExe.execute(pageQuery);
    }

    @Override
    public ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(BusinessSceneVersionQuery query) {
        return businessSceneVersionQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery) {
        return businessSceneVersionPageQueryExe.execute(pageQuery);
    }

    @Override
    public PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(BusinessSceneListQuery pageQuery) {
        return businessSceneListQueryExe.execute(pageQuery);
    }

    @Override
    public ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query) {
        return businessSceneLatestVersionQueryExe.execute(query);
    }
}