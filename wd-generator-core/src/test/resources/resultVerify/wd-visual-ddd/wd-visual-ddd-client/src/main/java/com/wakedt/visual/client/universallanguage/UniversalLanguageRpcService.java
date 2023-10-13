package com.wakedt.visual.client.universallanguage;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguagePageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageCreateDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageModifyDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageRemoveDTO;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 统一语言域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public interface UniversalLanguageRpcService {

    /**
     * 新增统一语言
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Long> create(UniversalLanguageCreateDTO dto);

    /**
     * 编辑统一语言
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> modify(UniversalLanguageModifyDTO dto);

    /**
     * 删除统一语言
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> remove(UniversalLanguageRemoveDTO dto);

    /**
     * 查询统一语言详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ResultDTO<UniversalLanguageDTO> universalLanguageQuery(UniversalLanguageQuery query);

    /**
     * 分页查询统一语言
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果
     */
    PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery);

}