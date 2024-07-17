package com.wakedt.visual.domain.application.applicationversion.applicationversionpublish;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 发布应用版本-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class ApplicationVersionPublishCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;

    public void handle(ApplicationVersionPublishCmd updateCmd) {
        log.info("发布应用版本-指令处理器:{}", updateCmd);

        ApplicationVersion applicationVersion = repository.find(updateCmd.getId());
        applicationVersion.applicationVersionPublish(updateCmd);

        /* TODO CheckDependencyPublished(关联依赖已发布) 检查关联的业务场景、业务域是否发布 */

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(applicationVersion);

    }
}