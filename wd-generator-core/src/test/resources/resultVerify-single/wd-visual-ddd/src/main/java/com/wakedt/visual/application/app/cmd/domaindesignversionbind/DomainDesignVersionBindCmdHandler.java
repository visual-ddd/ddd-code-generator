package com.wakedt.visual.application.app.cmd.domaindesignversionbind;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.application.domain.applicationversion.*;

/**
 * 关联业务域版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Component
public class DomainDesignVersionBindCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;

    public void handle(DomainDesignVersionBindCmd updateCmd) {
        ApplicationVersion applicationVersion = repository.find(updateCmd.getId());
        applicationVersion.domainDesignVersionBind(updateCmd);

        /* TODO CheckExistDomainDesignVersionIds(业务域版本号合法) 校验业务域版本号是否存在 */

        /* TODO CheckUnpublishedDdVersionHasBindOther(关联锁定未发布的业务域版本号) 未发布的业务域同一个版本只能关联一个应用 */

        /* TODO CheckBindRepeatedDomainDesignVersion(业务域版本号唯一) 关联的同一业务域只能关联一个版本号 */

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(applicationVersion);
    }
}