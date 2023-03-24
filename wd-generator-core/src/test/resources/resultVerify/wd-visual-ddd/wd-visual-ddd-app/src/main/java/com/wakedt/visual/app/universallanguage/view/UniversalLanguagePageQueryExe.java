package com.wakedt.visual.app.universallanguage.view;

import java.util.List;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguagePageQuery;
import com.wakedt.visual.infrastructure.universallanguage.repository.model.UniversalLanguageDO;
import com.wakedt.visual.infrastructure.universallanguage.repository.mapper.UniversalLanguageMapper;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;
import com.wakedt.visual.app.universallanguage.assembler.UniversalLanguageDTO2UniversalLanguageDOConvert;

/**
 * 分页查询统一语言-查询器
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
