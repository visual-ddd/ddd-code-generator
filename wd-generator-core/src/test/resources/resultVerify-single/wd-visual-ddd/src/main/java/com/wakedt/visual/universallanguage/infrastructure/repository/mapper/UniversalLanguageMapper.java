package com.wakedt.visual.universallanguage.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.universallanguage.infrastructure.repository.model.UniversalLanguageDO;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageQuery;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguagePageQuery;

/**
 * UniversalLanguageMapper接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Mapper
public interface UniversalLanguageMapper extends BaseMapper<UniversalLanguageDO> {

    /**
      * 统一语言详情查询对象
      */
    UniversalLanguageDO universalLanguageQuery(UniversalLanguageQuery query);

    /**
      * 统一语言分页查询对象
      */
    List<UniversalLanguageDO> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery);

}