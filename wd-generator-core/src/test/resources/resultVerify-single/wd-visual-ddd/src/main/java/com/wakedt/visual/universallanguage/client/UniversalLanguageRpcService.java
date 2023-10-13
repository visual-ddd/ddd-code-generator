package com.wakedt.visual.universallanguage.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageQuery;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguagePageQuery;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageCreateDTO;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageModifyDTO;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageRemoveDTO;
import com.wakedt.visual.universallanguage.client.dto.UniversalLanguageDTO;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 统一语言域-RPC能力接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
public interface UniversalLanguageRpcService {

    /** 新增统一语言 */
    ResultDTO<Long> create(UniversalLanguageCreateDTO dto);

    /** 编辑统一语言 */
    ResultDTO<Boolean> modify(UniversalLanguageModifyDTO dto);

    /** 删除统一语言 */
    ResultDTO<Boolean> remove(UniversalLanguageRemoveDTO dto);

    /** 查询统一语言详情 */
    ResultDTO<UniversalLanguageDTO> universalLanguageQuery(UniversalLanguageQuery query);

    /** 分页查询统一语言 */
    PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery);

}