package com.wakedt.visual.universallanguage.app.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedt.visual.universallanguage.app.assembler.UniversalLanguageDTO2UniversalLanguageDOConvert;
import com.wakedt.visual.universallanguage.client.dto.UniversalLanguageDTO;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguagePageQuery;
import com.wakedt.visual.universallanguage.infrastructure.repository.mapper.UniversalLanguageMapper;
import com.wakedt.visual.universallanguage.infrastructure.repository.model.UniversalLanguageDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 统一语言分页查询对象-查询器
 */
@Component
public class UniversalLanguagePageQueryExe {

    @Resource
    private UniversalLanguageMapper mapper;

    public PageResultDTO<List<UniversalLanguageDTO>> execute(UniversalLanguagePageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<UniversalLanguageDO> pageInfo = new PageInfo<>(mapper.universalLanguagePageQuery(pageQuery));
        PageResultDTO<List<UniversalLanguageDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(UniversalLanguageDTO2UniversalLanguageDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
