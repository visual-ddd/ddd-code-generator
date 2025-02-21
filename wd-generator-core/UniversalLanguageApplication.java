package com.wakedt.visual.bizdomain.universallanguage.app;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.universallanguage.app.assembler.UniversalLanguageDTO2UniversalLanguageDOConvert;
import com.wakedt.visual.bizdomain.universallanguage.client.request.*;
import com.wakedt.visual.bizdomain.universallanguage.client.response.UniversalLanguageDTO;
import com.wakedt.visual.bizdomain.universallanguage.domain.universallanguage.UniversalLanguage;
import com.wakedt.visual.bizdomain.universallanguage.domain.universallanguage.UniversalLanguageRepository;
import com.wakedt.visual.bizdomain.universallanguage.infrastructure.repository.mapper.UniversalLanguageMapper;
import com.wakedt.visual.bizdomain.universallanguage.infrastructure.repository.model.UniversalLanguageDO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 统一语言域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class UniversalLanguageApplication {

    private UniversalLanguageRepository repository;
    private UniversalLanguageMapper mapper;

    public ResultDTO<Long> create(UniversalLanguageCreateDTO dto) {
        UniversalLanguage entity = BeanUtil.copyProperties(dto, UniversalLanguage.class);
        UniversalLanguage newEntity = repository.save(entity);
        Long id = newEntity.getId();
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> modify(UniversalLanguageModifyDTO dto) {
        UniversalLanguage universalLanguage = repository.find(dto.getId());
        universalLanguage.modify(dto);
        repository.save(universalLanguage);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> remove(UniversalLanguageRemoveDTO dto) {
        UniversalLanguage universalLanguage = repository.find(dto.getId());
        universalLanguage.remove(dto);
        repository.remove(universalLanguage);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<UniversalLanguageDTO> universalLanguageQuery(UniversalLanguageQuery query) {
        UniversalLanguageDO universalLanguageDO = mapper.universalLanguageQuery(query);
        UniversalLanguageDTO universalLanguageDTO = UniversalLanguageDTO2UniversalLanguageDOConvert.INSTANCE.do2Dto(universalLanguageDO);
        return ResultDTO.success(universalLanguageDTO);
    }

    public PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<UniversalLanguageDO> pageInfo = new PageInfo<>(mapper.universalLanguagePageQuery(pageQuery));
        return UniversalLanguageDTO2UniversalLanguageDOConvert.INSTANCE.convertPage(pageInfo);
    }
}