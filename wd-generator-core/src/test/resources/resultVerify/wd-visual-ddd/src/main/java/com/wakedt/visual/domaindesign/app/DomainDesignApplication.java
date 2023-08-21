package com.wakedt.visual.domaindesign.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.domaindesign.app.assembler.*;
import com.wakedt.visual.domaindesign.app.cmd.domaindesigncreate.DomainDesignCreateCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesigndslupdate.DomainDesignDslUpdateCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignmodify.DomainDesignModifyCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignremove.DomainDesignRemoveCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversioncreate.DomainDesignVersionCreateCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionfork.DomainDesignVersionForkCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionmodify.DomainDesignVersionModifyCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionpublish.DomainDesignVersionPublishCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionremove.DomainDesignVersionRemoveCmdHandler;
import com.wakedt.visual.domaindesign.app.view.*;
import com.wakedt.visual.domaindesign.client.dto.DomainDesignDTO;
import com.wakedt.visual.domaindesign.client.dto.DomainDesignVersionDTO;
import com.wakedt.visual.domaindesign.client.query.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务域
 */
@Service
public class DomainDesignApplication {

    @Resource
    private DomainDesignCreateCmdHandler domainDesignCreateCmdHandler;
    @Resource
    private DomainDesignModifyCmdHandler domainDesignModifyCmdHandler;
    @Resource
    private DomainDesignRemoveCmdHandler domainDesignRemoveCmdHandler;
    @Resource
    private DomainDesignVersionCreateCmdHandler domainDesignVersionCreateCmdHandler;
    @Resource
    private DomainDesignVersionModifyCmdHandler domainDesignVersionModifyCmdHandler;
    @Resource
    private DomainDesignVersionRemoveCmdHandler domainDesignVersionRemoveCmdHandler;
    @Resource
    private DomainDesignDslUpdateCmdHandler domainDesignDslUpdateCmdHandler;
    @Resource
    private DomainDesignVersionPublishCmdHandler domainDesignVersionPublishCmdHandler;
    @Resource
    private DomainDesignVersionForkCmdHandler domainDesignVersionForkCmdHandler;
    @Resource
    private DomainDesignQueryExe domainDesignQueryExe;
    @Resource
    private DomainDesignPageQueryExe domainDesignPageQueryExe;
    @Resource
    private DomainDesignVersionQueryExe domainDesignVersionQueryExe;
    @Resource
    private DomainDesignVersionPageQueryExe domainDesignVersionPageQueryExe;
    @Resource
    private DomainDesignLatestVersionQueryExe domainDesignLatestVersionQueryExe;
    @Resource
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