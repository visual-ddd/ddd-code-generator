package com.wakedt.visual.domain.application.applicationversion.applicationversionmodify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 编辑应用版本-指令处理器
 */
@Component
public class ApplicationVersionModifyCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;

    public void handle(ApplicationVersionModifyCmd updateCmd) {
        ApplicationVersion applicationVersion = repository.find(updateCmd.getId());
        applicationVersion.applicationVersionModify(updateCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(applicationVersion);

        // DomainEventPublisher.getInstance().postAfterCommit(new ApplicationVersionModifyEvent(updateCmd));
    }
}