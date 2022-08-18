package com.wake.generator.client.manage.api;

import com.wake.generator.client.manage.api.query.DomainQuery;
import com.wake.generator.client.manage.dto.DomainDto;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import java.util.List;

/**
 * 领域管理服务接口
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
public interface DomainService {

    ResultDTO<Long> createDomain(DomainDto projectDto);

    ResultDTO<Boolean> removeDomain(List<Long> projectIds);

    ResultDTO<Boolean> modifyDomain(DomainDto projectDto);

    ResultDTO<DomainDto> detailDomain(Long projectId);

    PageResultDTO<List<DomainDto>> pageQueryDomain(DomainQuery projectQuery);

}

