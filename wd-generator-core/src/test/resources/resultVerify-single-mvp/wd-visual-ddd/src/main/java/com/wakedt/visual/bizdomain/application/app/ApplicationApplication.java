package com.wakedt.visual.bizdomain.application.app;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationDTO2ApplicationDOConvert;
import com.wakedt.visual.bizdomain.application.app.assembler.ApplicationVersionDTO2ApplicationVersionDOConvert;
import com.wakedt.visual.bizdomain.application.client.request.*;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationDTO;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationVersionDTO;
import com.wakedt.visual.bizdomain.application.domain.application.Application;
import com.wakedt.visual.bizdomain.application.domain.application.ApplicationRepository;
import com.wakedt.visual.bizdomain.application.domain.applicationversion.ApplicationVersion;
import com.wakedt.visual.bizdomain.application.domain.applicationversion.ApplicationVersionRepository;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.mapper.ApplicationMapper;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.mapper.ApplicationVersionMapper;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationDO;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationVersionDO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 应用域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class ApplicationApplication {

    private ApplicationRepository applicationRepository;
    private ApplicationVersionRepository applicationVersionRepository;
    private ApplicationMapper applicationMapper;
    private ApplicationVersionMapper applicationVersionMapper;

    public ResultDTO<Long> applicationCreate(ApplicationCreateDTO dto) {
        Application entity = BeanUtil.copyProperties(dto, Application.class);
        Application newEntity = applicationRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<Boolean> applicationModify(ApplicationModifyDTO dto) {
        Application entity = applicationRepository.find(dto.getId());
        entity.applicationModify(dto);
        applicationRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> applicationRemove(ApplicationRemoveDTO dto) {
        Application entity = applicationRepository.find(dto.getId());
        entity.applicationRemove(dto);
        applicationRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> applicationVersionCreate(ApplicationVersionCreateDTO dto) {
        ApplicationVersion entity = BeanUtil.copyProperties(dto, ApplicationVersion.class);
        ApplicationVersion newEntity = applicationVersionRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<Boolean> applicationVersionRemove(ApplicationVersionRemoveDTO dto) {
        ApplicationVersion entity = applicationVersionRepository.find(dto.getId());
        entity.applicationVersionRemove(dto);
        applicationVersionRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> businessSceneVersionBind(BusinessSceneVersionBindDTO dto) {
        ApplicationVersion entity = applicationVersionRepository.find(dto.getId());
        entity.businessSceneVersionBind(dto);
        applicationVersionRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> domainDesignVersionBind(DomainDesignVersionBindDTO dto) {
        ApplicationVersion entity = applicationVersionRepository.find(dto.getId());
        entity.domainDesignVersionBind(dto);
        applicationVersionRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> applicationVersionPublish(ApplicationVersionPublishDTO dto) {
        ApplicationVersion entity = applicationVersionRepository.find(dto.getId());
        entity.applicationVersionPublish(dto);
        applicationVersionRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> applicationVersionFork(ApplicationVersionForkDTO dto) {
        ApplicationVersion entity = BeanUtil.copyProperties(dto, ApplicationVersion.class);
        ApplicationVersion newEntity = applicationVersionRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<ApplicationDTO> applicationQuery(ApplicationQuery query) {
        ApplicationDO applicationDO = applicationMapper.applicationQuery(query);
        return ResultDTO.success(ApplicationDTO2ApplicationDOConvert.INSTANCE.do2Dto(applicationDO));
    }

    public PageResultDTO<List<ApplicationDTO>> applicationPageQuery(ApplicationPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());
        PageInfo<ApplicationDO> pageInfo = new PageInfo<>(applicationMapper.applicationPageQuery(pageQuery));
        return ApplicationDTO2ApplicationDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public ResultDTO<ApplicationVersionDTO> applicationVersionQuery(ApplicationVersionQuery query) {
        ApplicationVersionDO applicationVersionDO = applicationVersionMapper.applicationVersionQuery(query);
        return ResultDTO.success(ApplicationVersionDTO2ApplicationVersionDOConvert.INSTANCE.do2Dto(applicationVersionDO));
    }

    public PageResultDTO<List<ApplicationVersionDTO>> applicationVersionPageQuery(ApplicationVersionPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());
        PageInfo<ApplicationVersionDO> pageInfo = new PageInfo<>(applicationVersionMapper.applicationVersionPageQuery(pageQuery));
        return ApplicationVersionDTO2ApplicationVersionDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public PageResultDTO<List<ApplicationDTO>> applicationListQuery(ApplicationListQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());
        PageInfo<ApplicationDO> pageInfo = new PageInfo<>(applicationMapper.applicationListQuery(pageQuery));
        return ApplicationDTO2ApplicationDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public ResultDTO<ApplicationVersionDTO> applicationLatestVersionQuery(ApplicationLatestVersionQuery query) {
        ApplicationVersionDO applicationVersionDO = applicationVersionMapper.applicationLatestVersionQuery(query);
        return ResultDTO.success(ApplicationVersionDTO2ApplicationVersionDOConvert.INSTANCE.do2Dto(applicationVersionDO));
    }
}