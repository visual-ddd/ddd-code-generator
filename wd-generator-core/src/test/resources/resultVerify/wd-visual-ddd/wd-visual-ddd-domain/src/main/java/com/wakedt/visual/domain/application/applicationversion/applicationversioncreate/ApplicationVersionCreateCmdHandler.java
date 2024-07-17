package com.wakedt.visual.domain.application.applicationversion.applicationversioncreate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 新增应用版本-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class ApplicationVersionCreateCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;
    @Resource
    private ApplicationVersionFactory factory;

    public Long handle(ApplicationVersionCreateCmd createCmd) {
        log.info("新增应用版本-指令处理器:{}", createCmd);

        ApplicationVersion entity = factory.getInstance(createCmd);

        /* TODO CheckLegalVersion(版本号合法) 校验版本号命名是否符合标准 */

        ApplicationVersion newEntity = repository.save(entity);

        return newEntity.getId();
    }
}