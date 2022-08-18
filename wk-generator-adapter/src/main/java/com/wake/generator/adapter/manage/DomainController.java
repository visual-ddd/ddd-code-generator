package com.wake.generator.adapter.manage;

import com.wake.generator.client.manage.api.DomainService;
import com.wake.generator.client.manage.api.query.DomainQuery;
import com.wake.generator.client.manage.dto.DomainDto;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 领域页面管理
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
@RequestMapping("/domain/manage")
@RestController
public class DomainController {

    @Resource
    private DomainService domainService;

    @PostMapping("/save")
    public ResultDTO<Long> save(@RequestBody DomainDto domainDto) {
        return domainService.createDomain(domainDto);
    }

    @GetMapping("/remove")
    public ResultDTO<Boolean> remove(@RequestParam("domainIds") Long[] domainIds) {
        return domainService.removeDomain(Arrays.asList(domainIds));
    }

    @PostMapping("/modify")
    public ResultDTO<Boolean> modify(@RequestBody DomainDto domainDto) {
        return domainService.modifyDomain(domainDto);
    }

    @GetMapping("/detail")
    public ResultDTO<DomainDto> detailDomain(@RequestParam("domainId") Long domainId) {
        return domainService.detailDomain(domainId);
    }

    @GetMapping("/page_query")
    public PageResultDTO<List<DomainDto>> pageQueryDomain(DomainQuery domainQuery) {
        return domainService.pageQueryDomain(domainQuery);
    }

}
