package com.wakedt.visual.universallanguage.infrastructure.repository;

import com.wakedata.common.core.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguage;
import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguageRepository;
import com.wakedt.visual.universallanguage.infrastructure.repository.model.UniversalLanguageDO;
import com.wakedt.visual.universallanguage.infrastructure.repository.mapper.UniversalLanguageMapper;
import com.wakedt.visual.universallanguage.infrastructure.assembler.UniversalLanguage2UniversalLanguageDOConvert;

/**
 * UniversalLanguage-聚合仓储实现类
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Slf4j
@Component
public class UniversalLanguageRepositoryImpl implements UniversalLanguageRepository {

    @Resource
    private UniversalLanguageMapper universalLanguageMapper;

    @Override
    public UniversalLanguage save(UniversalLanguage universalLanguage) {
        UniversalLanguageDO universalLanguageDO = UniversalLanguage2UniversalLanguageDOConvert.INSTANCE.dto2Do(universalLanguage);
        int insert = universalLanguageMapper.insert(universalLanguageDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return UniversalLanguage2UniversalLanguageDOConvert.INSTANCE.do2Dto(universalLanguageDO);
    }

    @Override
    public UniversalLanguage update(UniversalLanguage universalLanguage) {
        UniversalLanguageDO universalLanguageDO = UniversalLanguage2UniversalLanguageDOConvert.INSTANCE.dto2Do(universalLanguage);
        int update = universalLanguageMapper.updateById(universalLanguageDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return UniversalLanguage2UniversalLanguageDOConvert.INSTANCE.do2Dto(universalLanguageDO);
    }

    @Override
    public void remove(UniversalLanguage universalLanguage) {
        UniversalLanguageDO universalLanguageDO = UniversalLanguage2UniversalLanguageDOConvert.INSTANCE.dto2Do(universalLanguage);
        universalLanguageMapper.deleteById(universalLanguageDO.getId());
    }

    @Override
    public UniversalLanguage find(Long id) {
        UniversalLanguageDO result = universalLanguageMapper.selectById(id);
        if (result == null) throw new BizException("id不存在!");
        return UniversalLanguage2UniversalLanguageDOConvert.INSTANCE.do2Dto(result);
    }
}
