package com.wakedt.visual.universallanguage.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.universallanguage.app.UniversalLanguageApplication;
import com.wakedt.visual.universallanguage.client.dto.UniversalLanguageDTO;
import com.wakedt.visual.universallanguage.client.query.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 统一语言域-RPC能力接口实现
 */
@Service
public class UniversalLanguageRpcServiceImpl implements UniversalLanguageRpcService {

    @Resource
    private UniversalLanguageApplication application;

    @Override
    public ResultDTO<Long> create(UniversalLanguageCreateDTO dto) {
        return application.create(dto);
    }

    @Override
    public ResultDTO<Boolean> modify(UniversalLanguageModifyDTO dto) {
        return application.modify(dto);
    }

    @Override
    public ResultDTO<Boolean> remove(UniversalLanguageRemoveDTO dto) {
        return application.remove(dto);
    }

    @Override
    public ResultDTO<UniversalLanguageDTO> universalLanguageQuery(UniversalLanguageQuery query) {
        return application.universalLanguageQuery(query);
    }

    @Override
    public PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery) {
        return application.universalLanguagePageQuery(pageQuery);
    }
}