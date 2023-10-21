package com.wakedt.visual.infrastructure.businessscene.repository;

import com.wakedata.common.core.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.domain.businessscene.businesssceneversion.BusinessSceneVersion;
import com.wakedt.visual.domain.businessscene.businesssceneversion.BusinessSceneVersionRepository;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneVersionMapper;
import com.wakedt.visual.infrastructure.businessscene.assembler.BusinessSceneVersion2BusinessSceneVersionDOConvert;

/**
 * BusinessSceneVersion-聚合仓储实现类
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class BusinessSceneVersionRepositoryImpl implements BusinessSceneVersionRepository {

    @Resource
    private BusinessSceneVersionMapper businessSceneVersionMapper;

    @Override
    public BusinessSceneVersion save(BusinessSceneVersion businessSceneVersion) {
        BusinessSceneVersionDO businessSceneVersionDO = BusinessSceneVersion2BusinessSceneVersionDOConvert.INSTANCE.dto2Do(businessSceneVersion);
        int insert = businessSceneVersionMapper.insert(businessSceneVersionDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return BusinessSceneVersion2BusinessSceneVersionDOConvert.INSTANCE.do2Dto(businessSceneVersionDO);
    }

    @Override
    public BusinessSceneVersion update(BusinessSceneVersion businessSceneVersion) {
        BusinessSceneVersionDO businessSceneVersionDO = BusinessSceneVersion2BusinessSceneVersionDOConvert.INSTANCE.dto2Do(businessSceneVersion);
        int update = businessSceneVersionMapper.updateById(businessSceneVersionDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return BusinessSceneVersion2BusinessSceneVersionDOConvert.INSTANCE.do2Dto(businessSceneVersionDO);
    }

    @Override
    public void remove(BusinessSceneVersion businessSceneVersion) {
        BusinessSceneVersionDO businessSceneVersionDO = BusinessSceneVersion2BusinessSceneVersionDOConvert.INSTANCE.dto2Do(businessSceneVersion);
        businessSceneVersionMapper.deleteById(businessSceneVersionDO.getId());
    }

    @Override
    public BusinessSceneVersion find(Long id) {
        BusinessSceneVersionDO result = Optional.ofNullable(businessSceneVersionMapper.selectById(id))
                .orElseThrow(() -> new IllegalArgumentException("id不存在!"));
        return BusinessSceneVersion2BusinessSceneVersionDOConvert.INSTANCE.do2Dto(result);
    }
}
