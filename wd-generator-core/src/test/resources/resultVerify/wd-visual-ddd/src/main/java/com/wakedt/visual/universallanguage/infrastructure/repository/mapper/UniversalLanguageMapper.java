package com.wakedt.visual.universallanguage.infrastructure.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguagePageQuery;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageQuery;
import com.wakedt.visual.universallanguage.infrastructure.repository.model.UniversalLanguageDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * UniversalLanguageMapper接口
 */
@Mapper
public interface UniversalLanguageMapper extends BaseMapper<UniversalLanguageDO> {

    /** 统一语言详情查询对象 */
    UniversalLanguageDO universalLanguageQuery(UniversalLanguageQuery query);

    /** 统一语言分页查询对象 */
    List<UniversalLanguageDO> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery);

}