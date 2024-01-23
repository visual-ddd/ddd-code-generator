package com.wakedt.visual.infrastructure.domaindesign.repository;

import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.core.resultcode.CommonResultCode;
import com.wakedt.visual.domain.domaindesign.domaindesign.DomainDesign;
import com.wakedt.visual.domain.domaindesign.domaindesign.DomainDesignRepository;
import com.wakedt.visual.infrastructure.domaindesign.assembler.DomainDesign2DomainDesignDOConvert;
import com.wakedt.visual.infrastructure.domaindesign.repository.mapper.DomainDesignMapper;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * 业务域-聚合仓储实现类
 *
 * @author shimmer
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
        DomainDesignDO result = Optional.ofNullable(domainDesignMapper.selectById(id))
                .orElseThrow(() -> new BizException(CommonResultCode.NOT_EXISTS));
        return DomainDesign2DomainDesignDOConvert.INSTANCE.do2Dto(result);
    }
}