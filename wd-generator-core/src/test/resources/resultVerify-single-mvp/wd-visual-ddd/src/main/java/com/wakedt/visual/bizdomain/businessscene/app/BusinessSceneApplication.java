package com.wakedt.visual.bizdomain.businessscene.app;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessScenePageQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPageQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneListQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneLatestVersionQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneCreateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneModifyDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneRemoveDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionCreateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionRemoveDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPublishDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionForkDTO;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneDTO;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneVersionDTO;
import com.wakedt.visual.bizdomain.businessscene.domain.businessscene.BusinessSceneRepository;
import com.wakedt.visual.bizdomain.businessscene.domain.businesssceneversion.BusinessSceneVersionRepository;
import com.wakedt.visual.bizdomain.businessscene.domain.businessscene.BusinessScene;
import com.wakedt.visual.bizdomain.businessscene.domain.businesssceneversion.BusinessSceneVersion;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneDTO2BusinessSceneDOConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneDTO2BusinessSceneDOConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneDTO2BusinessSceneDOConvert;
import com.wakedt.visual.bizdomain.businessscene.app.assembler.BusinessSceneVersionDTO2BusinessSceneVersionDOConvert;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneDO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneDO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneDO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务场景域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class BusinessSceneApplication {

    private BusinessSceneRepository businessSceneRepository;
    private BusinessSceneVersionRepository businessSceneVersionRepository;
    private BusinessSceneMapper businessSceneMapper;
    private BusinessSceneVersionMapper businessSceneVersionMapper;

    public ResultDTO<Long> businessSceneCreate(BusinessSceneCreateDTO dto) {
        BusinessScene entity = BeanUtil.copyProperties(dto, BusinessScene.class);
        BusinessScene newEntity = businessSceneRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<Boolean> businessSceneModify(BusinessSceneModifyDTO dto) {
        BusinessScene entity = businessSceneRepository.find(dto.getId());
        entity.businessSceneModify(dto);
        businessSceneRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneRemove(BusinessSceneRemoveDTO dto) {
        BusinessScene entity = businessSceneRepository.find(dto.getId());
        entity.businessSceneRemove(dto);
        businessSceneRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneVersionModify(BusinessSceneVersionModifyDTO dto) {
        BusinessSceneVersion entity = businessSceneVersionRepository.find(dto.getId());
        entity.businessSceneVersionModify(dto);
        businessSceneVersionRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneVersionRemove(BusinessSceneVersionRemoveDTO dto) {
        BusinessSceneVersion entity = businessSceneVersionRepository.find(dto.getId());
        entity.businessSceneVersionRemove(dto);
        businessSceneVersionRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> dslUpdate(BusinessSceneVersionDSLUpdateDTO dto) {
        BusinessSceneVersion entity = businessSceneVersionRepository.find(dto.getId());
        entity.dslUpdate(dto);
        businessSceneVersionRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneVersionPublish(BusinessSceneVersionPublishDTO dto) {
        BusinessSceneVersion entity = businessSceneVersionRepository.find(dto.getId());
        entity.businessSceneVersionPublish(dto);
        businessSceneVersionRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> businessSceneVersionFork(BusinessSceneVersionForkDTO dto) {
        BusinessSceneVersion entity = BeanUtil.copyProperties(dto, BusinessSceneVersion.class);
        BusinessSceneVersion newEntity = businessSceneVersionRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<BusinessSceneDTO> businessSceneQuery(BusinessSceneQuery query) {
        BusinessSceneDO businessSceneDO = businessSceneMapper.businessSceneQuery(query);
        return ResultDTO.success(BusinessSceneDTO2BusinessSceneDOConvert.INSTANCE.do2Dto(businessSceneDO));
    }

    public PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(BusinessScenePageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<BusinessSceneDO> pageInfo = new PageInfo<>(businessSceneMapper.businessScenePageQuery(pageQuery));
        return BusinessSceneDTO2BusinessSceneDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(BusinessSceneVersionQuery query) {
        BusinessSceneVersionDO businessSceneVersionDO = businessSceneVersionMapper.businessSceneVersionQuery(query);
        return ResultDTO.success(BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.INSTANCE.do2Dto(businessSceneVersionDO));
    }

    public PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<BusinessSceneVersionDO> pageInfo = new PageInfo<>(businessSceneVersionMapper.businessSceneVersionPageQuery(pageQuery));
        return BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(BusinessSceneListQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<BusinessSceneDO> pageInfo = new PageInfo<>(businessSceneMapper.businessSceneListQuery(pageQuery));
        return BusinessSceneDTO2BusinessSceneDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query) {
        BusinessSceneVersionDO businessSceneVersionDO = businessSceneVersionMapper.businessSceneLatestVersionQuery(query);
        return ResultDTO.success(BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.INSTANCE.do2Dto(businessSceneVersionDO));
    }
}