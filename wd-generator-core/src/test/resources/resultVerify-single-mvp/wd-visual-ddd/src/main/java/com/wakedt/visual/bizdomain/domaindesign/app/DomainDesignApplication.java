package com.wakedt.visual.bizdomain.domaindesign.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignPageQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionPageQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignLatestVersionQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignListQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignCreateDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignModifyDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignRemoveDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionCreateDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionModifyDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionRemoveDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignDslUpdateDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionPublishDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionForkDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.response.DomainDesignDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.response.DomainDesignVersionDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.view.DomainDesignQueryExe;
import com.wakedt.visual.bizdomain.domaindesign.app.view.DomainDesignPageQueryExe;
import com.wakedt.visual.bizdomain.domaindesign.app.view.DomainDesignVersionQueryExe;
import com.wakedt.visual.bizdomain.domaindesign.app.view.DomainDesignVersionPageQueryExe;
import com.wakedt.visual.bizdomain.domaindesign.app.view.DomainDesignLatestVersionQueryExe;
import com.wakedt.visual.bizdomain.domaindesign.app.view.DomainDesignListQueryExe;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignCreateDTO2DomainDesignCreateCmdConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignModifyDTO2DomainDesignModifyCmdConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesigncreate.DomainDesignCreateCmdHandler;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignmodify.DomainDesignModifyCmdHandler;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignremove.DomainDesignRemoveCmdHandler;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversioncreate.DomainDesignVersionCreateCmdHandler;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionmodify.DomainDesignVersionModifyCmdHandler;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionremove.DomainDesignVersionRemoveCmdHandler;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesigndslupdate.DomainDesignDslUpdateCmdHandler;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionpublish.DomainDesignVersionPublishCmdHandler;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionfork.DomainDesignVersionForkCmdHandler;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class DomainDesignApplication {

    private DomainDesignCreateCmdHandler domainDesignCreateCmdHandler;
    private DomainDesignModifyCmdHandler domainDesignModifyCmdHandler;
    private DomainDesignRemoveCmdHandler domainDesignRemoveCmdHandler;
    private DomainDesignVersionCreateCmdHandler domainDesignVersionCreateCmdHandler;
    private DomainDesignVersionModifyCmdHandler domainDesignVersionModifyCmdHandler;
    private DomainDesignVersionRemoveCmdHandler domainDesignVersionRemoveCmdHandler;
    private DomainDesignDslUpdateCmdHandler domainDesignDslUpdateCmdHandler;
    private DomainDesignVersionPublishCmdHandler domainDesignVersionPublishCmdHandler;
    private DomainDesignVersionForkCmdHandler domainDesignVersionForkCmdHandler;
    private DomainDesignQueryExe domainDesignQueryExe;
    private DomainDesignPageQueryExe domainDesignPageQueryExe;
    private DomainDesignVersionQueryExe domainDesignVersionQueryExe;
    private DomainDesignVersionPageQueryExe domainDesignVersionPageQueryExe;
    private DomainDesignLatestVersionQueryExe domainDesignLatestVersionQueryExe;
    private DomainDesignListQueryExe domainDesignListQueryExe;


    public ResultDTO<Long> domainDesignCreate(DomainDesignCreateDTO dto) {
        Long id = domainDesignCreateCmdHandler.handle(DomainDesignCreateDTO2DomainDesignCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> domainDesignModify(DomainDesignModifyDTO dto) {
        domainDesignModifyCmdHandler.handle(DomainDesignModifyDTO2DomainDesignModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> domainDesignRemove(DomainDesignRemoveDTO dto) {
        domainDesignRemoveCmdHandler.handle(DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> domainDesignVersionCreate(DomainDesignVersionCreateDTO dto) {
        Long id = domainDesignVersionCreateCmdHandler.handle(DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> domainDesignVersionModify(DomainDesignVersionModifyDTO dto) {
        domainDesignVersionModifyCmdHandler.handle(DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> domainDesignVersionRemove(DomainDesignVersionRemoveDTO dto) {
        domainDesignVersionRemoveCmdHandler.handle(DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> domainDesignDslUpdate(DomainDesignDslUpdateDTO dto) {
        domainDesignDslUpdateCmdHandler.handle(DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> domainDesignVersionPublish(DomainDesignVersionPublishDTO dto) {
        domainDesignVersionPublishCmdHandler.handle(DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> domainDesignVersionFork(DomainDesignVersionForkDTO dto) {
        Long id = domainDesignVersionForkCmdHandler.handle(DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<DomainDesignDTO> domainDesignQuery(DomainDesignQuery query) {
        return domainDesignQueryExe.execute(query);
    }

    public PageResultDTO<List<DomainDesignDTO>> domainDesignPageQuery(DomainDesignPageQuery pageQuery) {
        return domainDesignPageQueryExe.execute(pageQuery);
    }

    public ResultDTO<DomainDesignVersionDTO> domainDesignVersionQuery(DomainDesignVersionQuery query) {
        return domainDesignVersionQueryExe.execute(query);
    }

    public PageResultDTO<List<DomainDesignVersionDTO>> domainDesignVersionPageQuery(DomainDesignVersionPageQuery pageQuery) {
        return domainDesignVersionPageQueryExe.execute(pageQuery);
    }

    public ResultDTO<DomainDesignVersionDTO> domainDesignLatestVersionQuery(DomainDesignLatestVersionQuery query) {
        return domainDesignLatestVersionQueryExe.execute(query);
    }

    public PageResultDTO<List<DomainDesignDTO>> domainDesignListQuery(DomainDesignListQuery pageQuery) {
        return domainDesignListQueryExe.execute(pageQuery);
    }
}