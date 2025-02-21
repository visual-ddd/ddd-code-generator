package com.wakedt.visual.bizdomain.domaindesign.app;

import cn.hutool.core.bean.BeanUtil;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign.DomainDesignRepository;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesignversion.DomainDesignVersionRepository;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign.DomainDesign;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesignversion.DomainDesignVersion;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.mapper.DomainDesignMapper;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.mapper.DomainDesignVersionMapper;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignDTO2DomainDesignDOConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignDTO2DomainDesignDOConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionDTO2DomainDesignVersionDOConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionDTO2DomainDesignVersionDOConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignVersionDTO2DomainDesignVersionDOConvert;
import com.wakedt.visual.bizdomain.domaindesign.app.assembler.DomainDesignDTO2DomainDesignDOConvert;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignDO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignDO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignDO;
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

    private DomainDesignRepository domainDesignRepository;
    private DomainDesignVersionRepository domainDesignVersionRepository;
    private DomainDesignMapper domainDesignMapper;
    private DomainDesignVersionMapper domainDesignVersionMapper;

    public ResultDTO<Long> domainDesignCreate(DomainDesignCreateDTO dto) {
        DomainDesign entity = BeanUtil.copyProperties(dto, DomainDesign.class);
        DomainDesign newEntity = domainDesignRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }
    public ResultDTO<Boolean> domainDesignModify(DomainDesignModifyDTO dto) {
        DomainDesign entity = domainDesignRepository.find(dto.getId());
        entity.domainDesignModify(dto);
        domainDesignRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Boolean> domainDesignRemove(DomainDesignRemoveDTO dto) {
        DomainDesign entity = domainDesignRepository.find(dto.getId());
        entity.domainDesignRemove(dto);
        domainDesignRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Long> domainDesignVersionCreate(DomainDesignVersionCreateDTO dto) {
        DomainDesignVersion entity = BeanUtil.copyProperties(dto, DomainDesignVersion.class);
        DomainDesignVersion newEntity = domainDesignVersionRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }
    public ResultDTO<Boolean> domainDesignVersionModify(DomainDesignVersionModifyDTO dto) {
        DomainDesignVersion entity = domainDesignVersionRepository.find(dto.getId());
        entity.domainDesignVersionModify(dto);
        domainDesignVersionRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Boolean> domainDesignVersionRemove(DomainDesignVersionRemoveDTO dto) {
        DomainDesignVersion entity = domainDesignVersionRepository.find(dto.getId());
        entity.domainDesignVersionRemove(dto);
        domainDesignVersionRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Boolean> domainDesignDslUpdate(DomainDesignDslUpdateDTO dto) {
        DomainDesignVersion entity = domainDesignVersionRepository.find(dto.getId());
        entity.domainDesignDslUpdate(dto);
        domainDesignVersionRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Boolean> domainDesignVersionPublish(DomainDesignVersionPublishDTO dto) {
        DomainDesignVersion entity = domainDesignVersionRepository.find(dto.getId());
        entity.domainDesignVersionPublish(dto);
        domainDesignVersionRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Long> domainDesignVersionFork(DomainDesignVersionForkDTO dto) {
        DomainDesignVersion entity = BeanUtil.copyProperties(dto, DomainDesignVersion.class);
        DomainDesignVersion newEntity = domainDesignVersionRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<DomainDesignDTO> domainDesignQuery(DomainDesignQuery query) {
        DomainDesignDO domainDesignDO = domainDesignMapper.domainDesignQuery(query);
        return ResultDTO.success(DomainDesignDTO2DomainDesignDOConvert.INSTANCE.do2Dto(domainDesignDO));
    }

    public PageResultDTO<List<DomainDesignDTO>> domainDesignPageQuery(DomainDesignPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<DomainDesignDO> pageInfo = new PageInfo<>(domainDesignMapper.domainDesignPageQuery(pageQuery));
        return DomainDesignDTO2DomainDesignDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public ResultDTO<DomainDesignVersionDTO> domainDesignVersionQuery(DomainDesignVersionQuery query) {
        DomainDesignVersionDO domainDesignVersionDO = domainDesignVersionMapper.domainDesignVersionQuery(query);
        return ResultDTO.success(DomainDesignVersionDTO2DomainDesignVersionDOConvert.INSTANCE.do2Dto(domainDesignVersionDO));
    }

    public PageResultDTO<List<DomainDesignVersionDTO>> domainDesignVersionPageQuery(DomainDesignVersionPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<DomainDesignVersionDO> pageInfo = new PageInfo<>(domainDesignVersionMapper.domainDesignVersionPageQuery(pageQuery));
        return DomainDesignVersionDTO2DomainDesignVersionDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public ResultDTO<DomainDesignVersionDTO> domainDesignLatestVersionQuery(DomainDesignLatestVersionQuery query) {
        DomainDesignVersionDO domainDesignVersionDO = domainDesignVersionMapper.domainDesignLatestVersionQuery(query);
        return ResultDTO.success(DomainDesignVersionDTO2DomainDesignVersionDOConvert.INSTANCE.do2Dto(domainDesignVersionDO));
    }

    public PageResultDTO<List<DomainDesignDTO>> domainDesignListQuery(DomainDesignListQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<DomainDesignDO> pageInfo = new PageInfo<>(domainDesignMapper.domainDesignListQuery(pageQuery));
        return DomainDesignDTO2DomainDesignDOConvert.INSTANCE.convertPage(pageInfo);
    }
}