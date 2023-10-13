package com.wakedt.visual.infrastructure.universallanguage.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.universallanguage.repository.model.UniversalLanguageDO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguagePageQuery;

/**
 * UniversalLanguageMapper接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper
public interface UniversalLanguageMapper extends BaseMapper<UniversalLanguageDO> {

    /**
     * 查询统一语言详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    UniversalLanguageDO universalLanguageQuery(UniversalLanguageQuery query);

    /**
     * 分页查询统一语言
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<UniversalLanguageDO> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery);

}