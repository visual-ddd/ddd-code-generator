package com.wakedt.visual.businessscene.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.businessscene.app.BusinessSceneApplication;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneDTO;
import com.wakedt.visual.businessscene.client.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.businessscene.client.query.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务场景域-RPC能力接口实现
 */
@Service
public class BusinessSceneRpcServiceImpl implements BusinessSceneRpcService {

    @Resource
    private BusinessSceneApplication application;

    @Override
    public ResultDTO<Long> businessSceneCreate(BusinessSceneCreateDTO dto) {
        return application.businessSceneCreate(dto);
    }

    @Override
    public ResultDTO<Boolean> businessSceneModify(BusinessSceneModifyDTO dto) {
        return application.businessSceneModify(dto);
    }

    @Override
    public ResultDTO<Boolean> businessSceneRemove(BusinessSceneRemoveDTO dto) {
        return application.businessSceneRemove(dto);
    }

    @Override
    public ResultDTO<Boolean> businessSceneVersionModify(BusinessSceneVersionModifyDTO dto) {
        return application.businessSceneVersionModify(dto);
    }

    @Override
    public ResultDTO<Boolean> businessSceneVersionRemove(BusinessSceneVersionRemoveDTO dto) {
        return application.businessSceneVersionRemove(dto);
    }

    @Override
    public ResultDTO<Boolean> dslUpdate(BusinessSceneVersionDSLUpdateDTO dto) {
        return application.dslUpdate(dto);
    }

    @Override
    public ResultDTO<Boolean> businessSceneVersionPublish(BusinessSceneVersionPublishDTO dto) {
        return application.businessSceneVersionPublish(dto);
    }

    @Override
    public ResultDTO<Long> businessSceneVersionFork(BusinessSceneVersionForkDTO dto) {
        return application.businessSceneVersionFork(dto);
    }

    @Override
    public ResultDTO<BusinessSceneDTO> businessSceneQuery(BusinessSceneQuery query) {
        return application.businessSceneQuery(query);
    }

    @Override
    public PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(BusinessScenePageQuery pageQuery) {
        return application.businessScenePageQuery(pageQuery);
    }

    @Override
    public ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(BusinessSceneVersionQuery query) {
        return application.businessSceneVersionQuery(query);
    }

    @Override
    public PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery) {
        return application.businessSceneVersionPageQuery(pageQuery);
    }

    @Override
    public PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(BusinessSceneListQuery pageQuery) {
        return application.businessSceneListQuery(pageQuery);
    }

    @Override
    public ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query) {
        return application.businessSceneLatestVersionQuery(query);
    }
}