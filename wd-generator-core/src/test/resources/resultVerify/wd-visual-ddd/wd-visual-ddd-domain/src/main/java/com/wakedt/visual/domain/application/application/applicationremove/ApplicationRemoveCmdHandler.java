package com.wakedt.visual.domain.application.application.applicationremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.application.*;

/**
 * 删除应用-指令处理器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Component
public class ApplicationRemoveCmdHandler {

    @Resource
    private ApplicationRepository repository;

    public void handle(ApplicationRemoveCmd removeCmd) {
        Application application = repository.find(removeCmd.getId());
        application.applicationRemove(removeCmd);

        /* TODO CheckExistApplicationVersion(存在版本不能删除) 校验当前应用下是否存在版本 */

        repository.remove(application);

    }
}