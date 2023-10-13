package com.wakedt.visual.infrastructure.application.repository;

import com.wakedata.common.core.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.domain.application.application.Application;
import com.wakedt.visual.domain.application.application.ApplicationRepository;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import com.wakedt.visual.infrastructure.application.repository.mapper.ApplicationMapper;
import com.wakedt.visual.infrastructure.application.assembler.Application2ApplicationDOConvert;

/**
 * Application-聚合仓储实现类
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Slf4j
@Component
public class ApplicationRepositoryImpl implements ApplicationRepository {

    @Resource
    private ApplicationMapper applicationMapper;

    @Override
    public Application save(Application application) {
        ApplicationDO applicationDO = Application2ApplicationDOConvert.INSTANCE.dto2Do(application);
        int insert = applicationMapper.insert(applicationDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return Application2ApplicationDOConvert.INSTANCE.do2Dto(applicationDO);
    }

    @Override
    public Application update(Application application) {
        ApplicationDO applicationDO = Application2ApplicationDOConvert.INSTANCE.dto2Do(application);
        int update = applicationMapper.updateById(applicationDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return Application2ApplicationDOConvert.INSTANCE.do2Dto(applicationDO);
    }

    @Override
    public void remove(Application application) {
        ApplicationDO applicationDO = Application2ApplicationDOConvert.INSTANCE.dto2Do(application);
        applicationMapper.deleteById(applicationDO.getId());
    }

    @Override
    public Application find(Long id) {
        ApplicationDO result = Optional.ofNullable(applicationMapper.selectById(id))
                .orElseThrow(() -> new IllegalArgumentException("id不存在!"));
        return Application2ApplicationDOConvert.INSTANCE.do2Dto(result);
    }
}
