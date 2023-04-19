package com.wakedt.visual.infrastructure.domaindesign.repository;

import com.wakedata.common.core.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.DomainDesignVersion;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.DomainDesignVersionRepository;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.infrastructure.domaindesign.repository.mapper.DomainDesignVersionMapper;
import com.wakedt.visual.infrastructure.domaindesign.assembler.DomainDesignVersion2DomainDesignVersionDOConvert;

/**
 * domaindesignversion-聚合仓储实现类
 */
@Slf4j
@Component
public class DomainDesignVersionRepositoryImpl implements DomainDesignVersionRepository {

    @Resource
    private DomainDesignVersionMapper domainDesignVersionMapper;

    @Override
    public DomainDesignVersion save(DomainDesignVersion domainDesignVersion) {
        DomainDesignVersionDO domainDesignVersionDO = DomainDesignVersion2DomainDesignVersionDOConvert.INSTANCE.dto2Do(domainDesignVersion);
        int insert = domainDesignVersionMapper.insert(domainDesignVersionDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return DomainDesignVersion2DomainDesignVersionDOConvert.INSTANCE.do2Dto(domainDesignVersionDO);
    }

    @Override
    public DomainDesignVersion update(DomainDesignVersion domainDesignVersion) {
        DomainDesignVersionDO domainDesignVersionDO = DomainDesignVersion2DomainDesignVersionDOConvert.INSTANCE.dto2Do(domainDesignVersion);
        int update = domainDesignVersionMapper.updateById(domainDesignVersionDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return DomainDesignVersion2DomainDesignVersionDOConvert.INSTANCE.do2Dto(domainDesignVersionDO);
    }

    @Override
    public void remove(DomainDesignVersion domainDesignVersion) {
        DomainDesignVersionDO domainDesignVersionDO = DomainDesignVersion2DomainDesignVersionDOConvert.INSTANCE.dto2Do(domainDesignVersion);
        domainDesignVersionMapper.deleteById(domainDesignVersionDO.getId());
    }

    @Override
    public DomainDesignVersion find(Long id) {
        DomainDesignVersionDO result = domainDesignVersionMapper.selectById(id);
        if (result == null) throw new BizException("id不存在!");
        return DomainDesignVersion2DomainDesignVersionDOConvert.INSTANCE.do2Dto(result);
    }
}
