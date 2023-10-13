package com.wakedt.visual.application.app.cmd.applicationmodify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.application.domain.application.*;

/**
 * 编辑应用-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class ApplicationModifyCmdHandler {

    @Resource
    private ApplicationRepository repository;

    public void handle(ApplicationModifyCmd updateCmd) {
        Application application = repository.find(updateCmd.getId());
        application.applicationModify(updateCmd);

        repository.update(application);
    }
}