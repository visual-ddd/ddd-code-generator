package com.wakedt.visual.application.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.application.app.assembler.*;
import com.wakedt.visual.application.app.cmd.applicationcreate.ApplicationCreateCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationmodify.ApplicationModifyCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationremove.ApplicationRemoveCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationversioncreate.ApplicationVersionCreateCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationversionfork.ApplicationVersionForkCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationversionpublish.ApplicationVersionPublishCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationversionremove.ApplicationVersionRemoveCmdHandler;
import com.wakedt.visual.application.app.cmd.businesssceneversionbind.BusinessSceneVersionBindCmdHandler;
import com.wakedt.visual.application.app.cmd.domaindesignversionbind.DomainDesignVersionBindCmdHandler;
import com.wakedt.visual.application.app.view.*;
import com.wakedt.visual.application.client.dto.ApplicationDTO;
import com.wakedt.visual.application.client.dto.ApplicationVersionDTO;
import com.wakedt.visual.application.client.query.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 应用域
 */
@Service
public class ApplicationApplication {

    @Resource
    private ApplicationCreateCmdHandler applicationCreateCmdHandler;
    @Resource
    private ApplicationModifyCmdHandler applicationModifyCmdHandler;
    @Resource
    private ApplicationRemoveCmdHandler applicationRemoveCmdHandler;
    @Resource
    private ApplicationVersionCreateCmdHandler applicationVersionCreateCmdHandler;
    @Resource
    private ApplicationVersionRemoveCmdHandler applicationVersionRemoveCmdHandler;
    @Resource
    private BusinessSceneVersionBindCmdHandler businessSceneVersionBindCmdHandler;
    @Resource
    private DomainDesignVersionBindCmdHandler domainDesignVersionBindCmdHandler;
    @Resource
    private ApplicationVersionPublishCmdHandler applicationVersionPublishCmdHandler;
    @Resource
    private ApplicationVersionForkCmdHandler applicationVersionForkCmdHandler;
    @Resource
    private ApplicationQueryExe applicationQueryExe;
    @Resource
    private ApplicationPageQueryExe applicationPageQueryExe;
    @Resource
    private ApplicationVersionQueryExe applicationVersionQueryExe;
    @Resource
    private ApplicationVersionPageQueryExe applicationVersionPageQueryExe;
    @Resource
    private ApplicationListQueryExe applicationListQueryExe;
    @Resource
    private ApplicationLatestVersionQueryExe applicationLatestVersionQueryExe;


    public ResultDTO<Long> applicationCreate(ApplicationCreateDTO dto) {
        Long id = applicationCreateCmdHandler.handle(ApplicationCreateDTO2ApplicationCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> applicationModify(ApplicationModifyDTO dto) {
        applicationModifyCmdHandler.handle(ApplicationModifyDTO2ApplicationModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> applicationRemove(ApplicationRemoveDTO dto) {
        applicationRemoveCmdHandler.handle(ApplicationRemoveDTO2ApplicationRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> applicationVersionCreate(ApplicationVersionCreateDTO dto) {
        Long id = applicationVersionCreateCmdHandler.handle(ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> applicationVersionRemove(ApplicationVersionRemoveDTO dto) {
        applicationVersionRemoveCmdHandler.handle(ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneVersionBind(BusinessSceneVersionBindDTO dto) {
        businessSceneVersionBindCmdHandler.handle(BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> domainDesignVersionBind(DomainDesignVersionBindDTO dto) {
        domainDesignVersionBindCmdHandler.handle(DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> applicationVersionPublish(ApplicationVersionPublishDTO dto) {
        applicationVersionPublishCmdHandler.handle(ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> applicationVersionFork(ApplicationVersionForkDTO dto) {
        Long id = applicationVersionForkCmdHandler.handle(ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<ApplicationDTO> applicationQuery(ApplicationQuery query) {
        return applicationQueryExe.execute(query);
    }

    public PageResultDTO<List<ApplicationDTO>> applicationPageQuery(ApplicationPageQuery pageQuery) {
        return applicationPageQueryExe.execute(pageQuery);
    }

    public ResultDTO<ApplicationVersionDTO> applicationVersionQuery(ApplicationVersionQuery query) {
        return applicationVersionQueryExe.execute(query);
    }

    public PageResultDTO<List<ApplicationVersionDTO>> applicationVersionPageQuery(ApplicationVersionPageQuery pageQuery) {
        return applicationVersionPageQueryExe.execute(pageQuery);
    }

    public PageResultDTO<List<ApplicationDTO>> applicationListQuery(ApplicationListQuery pageQuery) {
        return applicationListQueryExe.execute(pageQuery);
    }

    public ResultDTO<ApplicationVersionDTO> applicationLatestVersionQuery(ApplicationLatestVersionQuery query) {
        return applicationLatestVersionQueryExe.execute(query);
    }
}