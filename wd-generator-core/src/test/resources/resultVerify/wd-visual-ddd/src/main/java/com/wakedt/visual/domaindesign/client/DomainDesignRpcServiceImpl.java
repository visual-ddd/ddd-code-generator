package com.wakedt.visual.domaindesign.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.domaindesign.app.DomainDesignApplication;
import com.wakedt.visual.domaindesign.client.dto.DomainDesignDTO;
import com.wakedt.visual.domaindesign.client.dto.DomainDesignVersionDTO;
import com.wakedt.visual.domaindesign.client.query.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务域-RPC能力接口实现
 */
@Service
public class DomainDesignRpcServiceImpl implements DomainDesignRpcService {

    @Resource
    private DomainDesignApplication application;

    @Override
    public ResultDTO<Long> domainDesignCreate(DomainDesignCreateDTO dto) {
        return application.domainDesignCreate(dto);
    }

    @Override
    public ResultDTO<Boolean> domainDesignModify(DomainDesignModifyDTO dto) {
        return application.domainDesignModify(dto);
    }

    @Override
    public ResultDTO<Boolean> domainDesignRemove(DomainDesignRemoveDTO dto) {
        return application.domainDesignRemove(dto);
    }

    @Override
    public ResultDTO<Long> domainDesignVersionCreate(DomainDesignVersionCreateDTO dto) {
        return application.domainDesignVersionCreate(dto);
    }

    @Override
    public ResultDTO<Boolean> domainDesignVersionModify(DomainDesignVersionModifyDTO dto) {
        return application.domainDesignVersionModify(dto);
    }

    @Override
    public ResultDTO<Boolean> domainDesignVersionRemove(DomainDesignVersionRemoveDTO dto) {
        return application.domainDesignVersionRemove(dto);
    }

    @Override
    public ResultDTO<Boolean> domainDesignDslUpdate(DomainDesignDslUpdateDTO dto) {
        return application.domainDesignDslUpdate(dto);
    }

    @Override
    public ResultDTO<Boolean> domainDesignVersionPublish(DomainDesignVersionPublishDTO dto) {
        return application.domainDesignVersionPublish(dto);
    }

    @Override
    public ResultDTO<Long> domainDesignVersionFork(DomainDesignVersionForkDTO dto) {
        return application.domainDesignVersionFork(dto);
    }

    @Override
    public ResultDTO<DomainDesignDTO> domainDesignQuery(DomainDesignQuery query) {
        return application.domainDesignQuery(query);
    }

    @Override
    public PageResultDTO<List<DomainDesignDTO>> domainDesignPageQuery(DomainDesignPageQuery pageQuery) {
        return application.domainDesignPageQuery(pageQuery);
    }

    @Override
    public ResultDTO<DomainDesignVersionDTO> domainDesignVersionQuery(DomainDesignVersionQuery query) {
        return application.domainDesignVersionQuery(query);
    }

    @Override
    public PageResultDTO<List<DomainDesignVersionDTO>> domainDesignVersionPageQuery(DomainDesignVersionPageQuery pageQuery) {
        return application.domainDesignVersionPageQuery(pageQuery);
    }

    @Override
    public ResultDTO<DomainDesignVersionDTO> domainDesignLatestVersionQuery(DomainDesignLatestVersionQuery query) {
        return application.domainDesignLatestVersionQuery(query);
    }

    @Override
    public PageResultDTO<List<DomainDesignDTO>> domainDesignListQuery(DomainDesignListQuery pageQuery) {
        return application.domainDesignListQuery(pageQuery);
    }
}