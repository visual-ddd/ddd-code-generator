package com.wakedt.visual.application.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.application.app.ApplicationApplication;
import com.wakedt.visual.application.client.dto.ApplicationDTO;
import com.wakedt.visual.application.client.dto.ApplicationVersionDTO;
import com.wakedt.visual.application.client.query.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 应用域-RPC能力接口实现
 */
@Service
public class ApplicationRpcServiceImpl implements ApplicationRpcService {

    @Resource
    private ApplicationApplication application;

    @Override
    public ResultDTO<Long> applicationCreate(ApplicationCreateDTO dto) {
        return application.applicationCreate(dto);
    }

    @Override
    public ResultDTO<Boolean> applicationModify(ApplicationModifyDTO dto) {
        return application.applicationModify(dto);
    }

    @Override
    public ResultDTO<Boolean> applicationRemove(ApplicationRemoveDTO dto) {
        return application.applicationRemove(dto);
    }

    @Override
    public ResultDTO<Long> applicationVersionCreate(ApplicationVersionCreateDTO dto) {
        return application.applicationVersionCreate(dto);
    }

    @Override
    public ResultDTO<Boolean> applicationVersionRemove(ApplicationVersionRemoveDTO dto) {
        return application.applicationVersionRemove(dto);
    }

    @Override
    public ResultDTO<Boolean> businessSceneVersionBind(BusinessSceneVersionBindDTO dto) {
        return application.businessSceneVersionBind(dto);
    }

    @Override
    public ResultDTO<Boolean> domainDesignVersionBind(DomainDesignVersionBindDTO dto) {
        return application.domainDesignVersionBind(dto);
    }

    @Override
    public ResultDTO<Boolean> applicationVersionPublish(ApplicationVersionPublishDTO dto) {
        return application.applicationVersionPublish(dto);
    }

    @Override
    public ResultDTO<Long> applicationVersionFork(ApplicationVersionForkDTO dto) {
        return application.applicationVersionFork(dto);
    }

    @Override
    public ResultDTO<ApplicationDTO> applicationQuery(ApplicationQuery query) {
        return application.applicationQuery(query);
    }

    @Override
    public PageResultDTO<List<ApplicationDTO>> applicationPageQuery(ApplicationPageQuery pageQuery) {
        return application.applicationPageQuery(pageQuery);
    }

    @Override
    public ResultDTO<ApplicationVersionDTO> applicationVersionQuery(ApplicationVersionQuery query) {
        return application.applicationVersionQuery(query);
    }

    @Override
    public PageResultDTO<List<ApplicationVersionDTO>> applicationVersionPageQuery(ApplicationVersionPageQuery pageQuery) {
        return application.applicationVersionPageQuery(pageQuery);
    }

    @Override
    public PageResultDTO<List<ApplicationDTO>> applicationListQuery(ApplicationListQuery pageQuery) {
        return application.applicationListQuery(pageQuery);
    }

    @Override
    public ResultDTO<ApplicationVersionDTO> applicationLatestVersionQuery(ApplicationLatestVersionQuery query) {
        return application.applicationLatestVersionQuery(query);
    }
}