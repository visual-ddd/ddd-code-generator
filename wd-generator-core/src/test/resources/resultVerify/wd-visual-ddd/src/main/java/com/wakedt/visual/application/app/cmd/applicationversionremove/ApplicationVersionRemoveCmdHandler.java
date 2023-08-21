package com.wakedt.visual.application.app.cmd.applicationversionremove;

import com.wakedt.visual.application.domain.applicationversion.ApplicationVersion;
import com.wakedt.visual.application.domain.applicationversion.ApplicationVersionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 删除应用版本-指令处理器
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