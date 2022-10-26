package com.wd.paas.generator.web.app.codegen.domainchart.view;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wd.paas.generator.web.app.codegen.domainchart.assember.DomainChartDTOConvert;
import com.wd.paas.generator.web.client.codegen.domainchart.dto.DomainChartDTO;
import com.wd.paas.generator.web.client.codegen.domainchart.query.DomainChartPageQuery;
import com.wd.paas.generator.web.infrastructure.codegen.repository.mapper.DomainChartMapper;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.DomainChartDO;
import java.util.List;
import javax.annotation.Resource;
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

    @Resource
    private DomainChartMapper domainChartMapper;

    public PageResultDTO<List<DomainChartDTO>> execute(DomainChartPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(), pageQuery.getPageSize());

        LambdaQueryWrapper<DomainChartDO> queryWrapper = new LambdaQueryWrapper<>();
        if (pageQuery.getProjectId() != null) {
            queryWrapper.eq(DomainChartDO::getProjectId, pageQuery.getProjectId());
        }
        List<DomainChartDO> domainChartDOS = domainChartMapper.selectList(queryWrapper);
        List<DomainChartDTO> domainChartDTOS = DomainChartDTOConvert.INSTANCE.doList2DtoList(
            domainChartDOS);

        PageInfo<DomainChartDTO> pageInfo = new PageInfo<>(domainChartDTOS);
        PageResultDTO<List<DomainChartDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(pageInfo.getList());
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
