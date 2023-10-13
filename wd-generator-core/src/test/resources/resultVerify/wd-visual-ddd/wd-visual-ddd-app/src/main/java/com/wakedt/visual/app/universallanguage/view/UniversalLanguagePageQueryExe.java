package com.wakedt.visual.app.universallanguage.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguagePageQuery;
import com.wakedt.visual.infrastructure.universallanguage.repository.model.UniversalLanguageDO;
import com.wakedt.visual.infrastructure.universallanguage.repository.mapper.UniversalLanguageMapper;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;
import com.wakedt.visual.app.universallanguage.assembler.UniversalLanguageDTO2UniversalLanguageDOConvert;

/**
 * 统一语言分页查询对象-查询器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Component
public class UniversalLanguagePageQueryExe {

    @Resource
    private UniversalLanguageMapper mapper;

    public PageResultDTO<List<UniversalLanguageDTO>> execute(UniversalLanguagePageQuery pageQuery) {
        PageMethod.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());

        PageInfo<UniversalLanguageDO> pageInfo = new PageInfo<>(mapper.universalLanguagePageQuery(pageQuery));
        PageResultDTO<List<UniversalLanguageDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(UniversalLanguageDTO2UniversalLanguageDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
