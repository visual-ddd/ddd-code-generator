package com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository;

import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.core.resultcode.CommonResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign.DomainDesign;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign.DomainDesignRepository;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignDO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.mapper.DomainDesignMapper;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.assembler.DomainDesign2DomainDesignDOConvert;

/**
 * DomainDesign-聚合仓储实现类
 *
 * @author visual-ddd
 * @since 1.0
 */
@Slf4j
@Component
public class DomainDesignRepositoryImpl implements DomainDesignRepository {

    @Resource
    private DomainDesignMapper domainDesignMapper;

    @Override
    public DomainDesign save(DomainDesign domainDesign) {
        DomainDesignDO domainDesignDO = DomainDesign2DomainDesignDOConvert.INSTANCE.dto2Do(domainDesign);
        int insert = domainDesignMapper.insert(domainDesignDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return DomainDesign2DomainDesignDOConvert.INSTANCE.do2Dto(domainDesignDO);
    }

    @Override
    public DomainDesign update(DomainDesign domainDesign) {
        DomainDesignDO domainDesignDO = DomainDesign2DomainDesignDOConvert.INSTANCE.dto2Do(domainDesign);
        int update = domainDesignMapper.updateById(domainDesignDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return DomainDesign2DomainDesignDOConvert.INSTANCE.do2Dto(domainDesignDO);
    }

    @Override
    public void remove(DomainDesign domainDesign) {
        DomainDesignDO domainDesignDO = DomainDesign2DomainDesignDOConvert.INSTANCE.dto2Do(domainDesign);
        domainDesignMapper.deleteById(domainDesignDO.getId());
    }

    @Override
    public DomainDesign find(Long id) {
        DomainDesignDO result = domainDesignMapper.selectById(id);
        if (result == null) throw new BizException(CommonResultCode.NOT_EXISTS);
        return DomainDesign2DomainDesignDOConvert.INSTANCE.do2Dto(result);
    }
}
