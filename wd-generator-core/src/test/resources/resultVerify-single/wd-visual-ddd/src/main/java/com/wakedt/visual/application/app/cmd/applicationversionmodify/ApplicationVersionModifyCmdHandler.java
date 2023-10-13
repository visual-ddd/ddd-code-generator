package com.wakedt.visual.application.app.cmd.applicationversionmodify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.application.domain.applicationversion.*;

/**
 * 编辑应用版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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
    }
}