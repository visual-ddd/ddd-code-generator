package com.wakedt.visual.domain.application.applicationversion.applicationversioncreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 新增应用版本-指令处理器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Component
public class ApplicationVersionCreateCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;
    @Resource
    private ApplicationVersionFactory factory;

    public Long handle(ApplicationVersionCreateCmd createCmd) {
        ApplicationVersion entity = factory.getInstance(createCmd);

        /* TODO CheckLegalVersion(版本号合法) 校验版本号命名是否符合标准 */

        ApplicationVersion newEntity = repository.save(entity);

        return newEntity.getId();
    }
}