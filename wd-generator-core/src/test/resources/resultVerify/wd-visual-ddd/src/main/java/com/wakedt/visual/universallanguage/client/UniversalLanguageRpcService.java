package com.wakedt.visual.universallanguage.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.universallanguage.client.dto.UniversalLanguageDTO;
import com.wakedt.visual.universallanguage.client.query.*;

import java.util.List;

/**
 * 统一语言域-RPC能力接口
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