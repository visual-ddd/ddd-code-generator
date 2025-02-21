package com.wakedt.visual.bizdomain.universallanguage.app;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageQuery;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguagePageQuery;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageCreateDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageModifyDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageRemoveDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.response.UniversalLanguageDTO;
import com.wakedt.visual.bizdomain.universallanguage.domain.universallanguage.UniversalLanguageRepository;
import com.wakedt.visual.bizdomain.universallanguage.domain.universallanguage.UniversalLanguage;
import com.wakedt.visual.bizdomain.universallanguage.infrastructure.repository.mapper.UniversalLanguageMapper;
import com.wakedt.visual.bizdomain.universallanguage.app.assembler.UniversalLanguageDTO2UniversalLanguageDOConvert;
import com.wakedt.visual.bizdomain.universallanguage.app.assembler.UniversalLanguageDTO2UniversalLanguageDOConvert;
import com.wakedt.visual.bizdomain.universallanguage.infrastructure.repository.model.UniversalLanguageDO;
import com.wakedt.visual.bizdomain.universallanguage.infrastructure.repository.model.UniversalLanguageDO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 统一语言域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class UniversalLanguageApplication {

    private UniversalLanguageRepository universalLanguageRepository;
    private UniversalLanguageMapper universalLanguageMapper;

    public ResultDTO<Long> create(UniversalLanguageCreateDTO dto) {
        UniversalLanguage entity = BeanUtil.copyProperties(dto, UniversalLanguage.class);
        UniversalLanguage newEntity = universalLanguageRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<Boolean> modify(UniversalLanguageModifyDTO dto) {
        UniversalLanguage entity = universalLanguageRepository.find(dto.getId());
        entity.modify(dto);
        universalLanguageRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> remove(UniversalLanguageRemoveDTO dto) {
        UniversalLanguage entity = universalLanguageRepository.find(dto.getId());
        entity.remove(dto);
        universalLanguageRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<UniversalLanguageDTO> universalLanguageQuery(UniversalLanguageQuery query) {
        UniversalLanguageDO universalLanguageDO = universalLanguageMapper.universalLanguageQuery(query);
        return ResultDTO.success(UniversalLanguageDTO2UniversalLanguageDOConvert.INSTANCE.do2Dto(universalLanguageDO));
    }

    public PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<UniversalLanguageDO> pageInfo = new PageInfo<>(universalLanguageMapper.universalLanguagePageQuery(pageQuery));
        return UniversalLanguageDTO2UniversalLanguageDOConvert.INSTANCE.convertPage(pageInfo);
    }
}