package com.wakedt.visual.infrastructure.businessscene.repository;

import com.wakedata.common.core.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.domain.businessscene.businessscene.BusinessScene;
import com.wakedt.visual.domain.businessscene.businessscene.BusinessSceneRepository;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;
import com.wakedt.visual.infrastructure.businessscene.repository.mapper.BusinessSceneMapper;
import com.wakedt.visual.infrastructure.businessscene.assembler.BusinessScene2BusinessSceneDOConvert;

/**
 * BusinessScene-聚合仓储实现类
 */
@Slf4j
@Component
public class BusinessSceneRepositoryImpl implements BusinessSceneRepository {

    @Resource
    private BusinessSceneMapper businessSceneMapper;

    @Override
    public BusinessScene save(BusinessScene businessScene) {
        BusinessSceneDO businessSceneDO = BusinessScene2BusinessSceneDOConvert.INSTANCE.dto2Do(businessScene);
        int insert = businessSceneMapper.insert(businessSceneDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return BusinessScene2BusinessSceneDOConvert.INSTANCE.do2Dto(businessSceneDO);
    }

    @Override
    public BusinessScene update(BusinessScene businessScene) {
        BusinessSceneDO businessSceneDO = BusinessScene2BusinessSceneDOConvert.INSTANCE.dto2Do(businessScene);
        int update = businessSceneMapper.updateById(businessSceneDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return BusinessScene2BusinessSceneDOConvert.INSTANCE.do2Dto(businessSceneDO);
    }

    @Override
    public void remove(BusinessScene businessScene) {
        BusinessSceneDO businessSceneDO = BusinessScene2BusinessSceneDOConvert.INSTANCE.dto2Do(businessScene);
        businessSceneMapper.deleteById(businessSceneDO.getId());
    }

    @Override
    public BusinessScene find(Long id) {
        BusinessSceneDO result = businessSceneMapper.selectById(id);
        if (result == null) throw new BizException("id不存在!");
        return BusinessScene2BusinessSceneDOConvert.INSTANCE.do2Dto(result);
    }
}
