package com.wakedt.visual.application.app.cmd.applicationversionremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.application.domain.applicationversion.*;

/**
 * 删除应用版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class ApplicationVersionRemoveCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;

    public void handle(ApplicationVersionRemoveCmd removeCmd) {
        ApplicationVersion applicationVersion = repository.find(removeCmd.getId());
        applicationVersion.applicationVersionRemove(removeCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.remove(applicationVersion);
    }
}