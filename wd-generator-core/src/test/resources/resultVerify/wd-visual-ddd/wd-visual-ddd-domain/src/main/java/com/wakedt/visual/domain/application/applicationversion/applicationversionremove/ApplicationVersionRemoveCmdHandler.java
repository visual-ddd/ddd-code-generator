package com.wakedt.visual.domain.application.applicationversion.applicationversionremove;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 删除应用版本-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class ApplicationVersionRemoveCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;

    public void handle(ApplicationVersionRemoveCmd removeCmd) {
        log.info("删除应用版本-指令处理器:{}", removeCmd);

        ApplicationVersion applicationVersion = repository.find(removeCmd.getId());
        applicationVersion.applicationVersionRemove(removeCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.remove(applicationVersion);

    }
}