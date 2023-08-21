package com.wakedt.visual.application.app.cmd.applicationversioncreate;

import com.wakedt.visual.application.domain.applicationversion.ApplicationVersion;
import com.wakedt.visual.application.domain.applicationversion.ApplicationVersionFactory;
import com.wakedt.visual.application.domain.applicationversion.ApplicationVersionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 新增应用版本-指令处理器
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