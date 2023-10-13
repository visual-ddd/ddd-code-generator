package com.wakedt.visual.businessscene.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
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
import com.wakedt.visual.businessscene.app.BusinessSceneApplication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务场景域-RPC能力接口实现
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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