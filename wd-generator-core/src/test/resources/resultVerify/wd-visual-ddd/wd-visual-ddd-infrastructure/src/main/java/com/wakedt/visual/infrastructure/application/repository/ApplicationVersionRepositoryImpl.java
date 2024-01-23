package com.wakedt.visual.infrastructure.application.repository;

import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.core.resultcode.CommonResultCode;
import com.wakedt.visual.domain.application.applicationversion.ApplicationVersion;
import com.wakedt.visual.domain.application.applicationversion.ApplicationVersionRepository;
import com.wakedt.visual.infrastructure.application.assembler.ApplicationVersion2ApplicationVersionDOConvert;
import com.wakedt.visual.infrastructure.application.repository.mapper.ApplicationVersionMapper;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationVersionDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * 应用版本-聚合仓储实现类
 *
 * @author shimmer
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
        ApplicationVersionDO result = Optional.ofNullable(applicationVersionMapper.selectById(id))
                .orElseThrow(() -> new BizException(CommonResultCode.NOT_EXISTS));
        return ApplicationVersion2ApplicationVersionDOConvert.INSTANCE.do2Dto(result);
    }
}