package com.wakedt.visual.infrastructure.universallanguage.repository.mapper;

import java.util.List;
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

    /** 查询统一语言详情 */
    UniversalLanguageDO universalLanguageQuery(UniversalLanguageQuery query);

    /** 分页查询统一语言 */
    List<UniversalLanguageDO> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery);

}