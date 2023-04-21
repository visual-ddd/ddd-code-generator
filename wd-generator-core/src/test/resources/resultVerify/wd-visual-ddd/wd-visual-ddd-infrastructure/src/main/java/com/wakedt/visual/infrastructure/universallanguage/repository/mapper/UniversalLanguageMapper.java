package com.wakedt.visual.infrastructure.universallanguage.repository.mapper;

import java.util.*;
import java.math.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.universallanguage.repository.model.UniversalLanguageDO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguagePageQuery;

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