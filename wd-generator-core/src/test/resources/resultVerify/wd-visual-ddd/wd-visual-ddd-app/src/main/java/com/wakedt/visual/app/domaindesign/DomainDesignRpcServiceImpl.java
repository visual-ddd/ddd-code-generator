package com.wakedt.visual.app.domaindesign;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.domaindesign.assembler.*;
import com.wakedt.visual.app.domaindesign.view.*;
import com.wakedt.visual.client.domaindesign.DomainDesignRpcService;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignDTO;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignVersionDTO;
import com.wakedt.visual.client.domaindesign.query.*;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesigncreate.DomainDesignCreateCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify.DomainDesignModifyCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove.DomainDesignRemoveCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate.DomainDesignDslUpdateCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversioncreate.DomainDesignVersionCreateCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionfork.DomainDesignVersionForkCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify.DomainDesignVersionModifyCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionpublish.DomainDesignVersionPublishCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionremove.DomainDesignVersionRemoveCmdHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务域-RPC能力接口实现
 */
@Service
public class DomainDesignRpcServiceImpl implements DomainDesignRpcService {

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


    @Override
    public ResultDTO<Long> domainDesignCreate(DomainDesignCreateDTO dto) {
        Long id = domainDesignCreateCmdHandler.handle(DomainDesignCreateDTO2DomainDesignCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> domainDesignModify(DomainDesignModifyDTO dto) {
        domainDesignModifyCmdHandler.handle(DomainDesignModifyDTO2DomainDesignModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> domainDesignRemove(DomainDesignRemoveDTO dto) {
        domainDesignRemoveCmdHandler.handle(DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Long> domainDesignVersionCreate(DomainDesignVersionCreateDTO dto) {
        Long id = domainDesignVersionCreateCmdHandler.handle(DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> domainDesignVersionModify(DomainDesignVersionModifyDTO dto) {
        domainDesignVersionModifyCmdHandler.handle(DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> domainDesignVersionRemove(DomainDesignVersionRemoveDTO dto) {
        domainDesignVersionRemoveCmdHandler.handle(DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> domainDesignDslUpdate(DomainDesignDslUpdateDTO dto) {
        domainDesignDslUpdateCmdHandler.handle(DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> domainDesignVersionPublish(DomainDesignVersionPublishDTO dto) {
        domainDesignVersionPublishCmdHandler.handle(DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Long> domainDesignVersionFork(DomainDesignVersionForkDTO dto) {
        Long id = domainDesignVersionForkCmdHandler.handle(DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<DomainDesignDTO> domainDesignQuery(DomainDesignQuery query) {
        return domainDesignQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<DomainDesignDTO>> domainDesignPageQuery(DomainDesignPageQuery pageQuery) {
        return domainDesignPageQueryExe.execute(pageQuery);
    }

    @Override
    public ResultDTO<DomainDesignVersionDTO> domainDesignVersionQuery(DomainDesignVersionQuery query) {
        return domainDesignVersionQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<DomainDesignVersionDTO>> domainDesignVersionPageQuery(DomainDesignVersionPageQuery pageQuery) {
        return domainDesignVersionPageQueryExe.execute(pageQuery);
    }

    @Override
    public ResultDTO<DomainDesignVersionDTO> domainDesignLatestVersionQuery(DomainDesignLatestVersionQuery query) {
        return domainDesignLatestVersionQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<DomainDesignDTO>> domainDesignListQuery(DomainDesignListQuery pageQuery) {
        return domainDesignListQueryExe.execute(pageQuery);
    }
}