package com.wakedt.visual.bizdomain.application.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationPageQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionPageQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationListQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationLatestVersionQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationCreateDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationModifyDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationRemoveDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionCreateDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionModifyDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionRemoveDTO;
import com.wakedt.visual.bizdomain.application.client.request.BusinessSceneVersionBindDTO;
import com.wakedt.visual.bizdomain.application.client.request.DomainDesignVersionBindDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionPublishDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionForkDTO;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationDTO;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationVersionDTO;
import com.wakedt.visual.bizdomain.application.app.view.ApplicationQueryExe;
import com.wakedt.visual.bizdomain.application.app.view.ApplicationPageQueryExe;
import com.wakedt.visual.bizdomain.application.app.view.ApplicationVersionQueryExe;
import com.wakedt.visual.bizdomain.application.app.view.ApplicationVersionPageQueryExe;
import com.wakedt.visual.bizdomain.application.app.view.ApplicationListQueryExe;
import com.wakedt.visual.bizdomain.application.app.view.ApplicationLatestVersionQueryExe;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationCreateDTO2ApplicationCreateCmdConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationModifyDTO2ApplicationModifyCmdConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationRemoveDTO2ApplicationRemoveCmdConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationcreate.ApplicationCreateCmdHandler;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationmodify.ApplicationModifyCmdHandler;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationremove.ApplicationRemoveCmdHandler;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversioncreate.ApplicationVersionCreateCmdHandler;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversionmodify.ApplicationVersionModifyCmdHandler;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversionremove.ApplicationVersionRemoveCmdHandler;
import com.wakedt.visual.bizdomain.application.app.cmd.businesssceneversionbind.BusinessSceneVersionBindCmdHandler;
import com.wakedt.visual.bizdomain.application.app.cmd.domaindesignversionbind.DomainDesignVersionBindCmdHandler;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversionpublish.ApplicationVersionPublishCmdHandler;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversionfork.ApplicationVersionForkCmdHandler;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 应用域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class ApplicationApplication {

    private ApplicationCreateCmdHandler applicationCreateCmdHandler;
    private ApplicationModifyCmdHandler applicationModifyCmdHandler;
    private ApplicationRemoveCmdHandler applicationRemoveCmdHandler;
    private ApplicationVersionCreateCmdHandler applicationVersionCreateCmdHandler;
    private ApplicationVersionRemoveCmdHandler applicationVersionRemoveCmdHandler;
    private BusinessSceneVersionBindCmdHandler businessSceneVersionBindCmdHandler;
    private DomainDesignVersionBindCmdHandler domainDesignVersionBindCmdHandler;
    private ApplicationVersionPublishCmdHandler applicationVersionPublishCmdHandler;
    private ApplicationVersionForkCmdHandler applicationVersionForkCmdHandler;
    private ApplicationQueryExe applicationQueryExe;
    private ApplicationPageQueryExe applicationPageQueryExe;
    private ApplicationVersionQueryExe applicationVersionQueryExe;
    private ApplicationVersionPageQueryExe applicationVersionPageQueryExe;
    private ApplicationListQueryExe applicationListQueryExe;
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