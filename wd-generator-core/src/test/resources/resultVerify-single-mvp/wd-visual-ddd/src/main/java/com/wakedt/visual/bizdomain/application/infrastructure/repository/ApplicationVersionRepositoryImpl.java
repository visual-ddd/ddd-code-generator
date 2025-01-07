package com.wakedt.visual.bizdomain.application.infrastructure.repository;

import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.core.resultcode.CommonResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.bizdomain.application.domain.applicationversion.ApplicationVersion;
import com.wakedt.visual.bizdomain.application.domain.applicationversion.ApplicationVersionRepository;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationVersionDO;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.mapper.ApplicationVersionMapper;
import com.wakedt.visual.bizdomain.application.infrastructure.assembler.ApplicationVersion2ApplicationVersionDOConvert;

/**
 * ApplicationVersion-聚合仓储实现类
 *
 * @author visual-ddd
 * @since 1.0
 */
@Slf4j
@Component
public class ApplicationVersionRepositoryImpl implements ApplicationVersionRepository {

    @Resource
    private ApplicationVersionMapper applicationVersionMapper;

    @Override
    public ApplicationVersion save(ApplicationVersion applicationVersion) {
        ApplicationVersionDO applicationVersionDO = ApplicationVersion2ApplicationVersionDOConvert.INSTANCE.dto2Do(applicationVersion);
        int insert = applicationVersionMapper.insert(applicationVersionDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return ApplicationVersion2ApplicationVersionDOConvert.INSTANCE.do2Dto(applicationVersionDO);
    }

    @Override
    public ApplicationVersion update(ApplicationVersion applicationVersion) {
        ApplicationVersionDO applicationVersionDO = ApplicationVersion2ApplicationVersionDOConvert.INSTANCE.dto2Do(applicationVersion);
        int update = applicationVersionMapper.updateById(applicationVersionDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return ApplicationVersion2ApplicationVersionDOConvert.INSTANCE.do2Dto(applicationVersionDO);
    }

    @Override
    public void remove(ApplicationVersion applicationVersion) {
        ApplicationVersionDO applicationVersionDO = ApplicationVersion2ApplicationVersionDOConvert.INSTANCE.dto2Do(applicationVersion);
        applicationVersionMapper.deleteById(applicationVersionDO.getId());
    }

    @Override
    public ApplicationVersion find(Long id) {
        ApplicationVersionDO result = applicationVersionMapper.selectById(id);
        if (result == null) throw new BizException(CommonResultCode.NOT_EXISTS);
        return ApplicationVersion2ApplicationVersionDOConvert.INSTANCE.do2Dto(result);
    }
}
