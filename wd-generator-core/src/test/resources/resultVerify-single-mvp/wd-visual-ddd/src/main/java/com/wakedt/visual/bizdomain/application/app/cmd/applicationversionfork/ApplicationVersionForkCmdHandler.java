package com.wakedt.visual.bizdomain.application.app.cmd.applicationversionfork;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.application.domain.applicationversion.*;

/**
 * Fork应用版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class ApplicationVersionForkCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;
    @Resource
    private ApplicationVersionFactory factory;

    public Long handle(ApplicationVersionForkCmd createCmd) {
        ApplicationVersion entity = factory.getInstance(createCmd);

        /* TODO CheckLegalVersion(版本号合法) 校验版本号命名是否符合标准 */

        /* TODO ForkVersion(fork新版本) 拷贝一个新版本 */

        ApplicationVersion newEntity = repository.save(entity);
        return newEntity.getId();
    }
}