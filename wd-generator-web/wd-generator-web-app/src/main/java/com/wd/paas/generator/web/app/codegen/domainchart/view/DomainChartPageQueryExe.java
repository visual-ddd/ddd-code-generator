package com.wd.paas.generator.web.app.codegen.domainchart.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wd.paas.generator.web.client.codegen.domainchart.dto.DomainChartDTO;
import com.wd.paas.generator.web.client.codegen.domainchart.query.DomainChartPageQuery;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 分页查询领域图谱信息-分页查询器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class DomainChartPageQueryExe {

    public PageResultDTO<List<DomainChartDTO>> execute(DomainChartPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        //List<ChannelTapeDO> channelTapeDOS = channelOrderMapper.channelTapeList(pageQuery);
        //List<ChannelTapeDTO> channelTapeDTOS = ChannelTapeDTOConvert.INSTANCE.doList2DtoList(channelTapeDOS);

        PageInfo<DomainChartDTO> pageInfo = new PageInfo<>();
        PageResultDTO<List<DomainChartDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(pageInfo.getList());
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
