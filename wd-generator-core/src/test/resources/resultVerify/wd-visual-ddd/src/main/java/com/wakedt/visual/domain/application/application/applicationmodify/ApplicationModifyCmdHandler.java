package com.wakedt.visual.domain.application.application.applicationmodify;

import com.wakedt.visual.domain.application.application.Application;
import com.wakedt.visual.domain.application.application.ApplicationRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 编辑应用-指令处理器
 */
@Component
public class ApplicationModifyCmdHandler {

    @Resource
    private ApplicationRepository repository;

    public void handle(ApplicationModifyCmd updateCmd) {
        Application application = repository.find(updateCmd.getId());
        application.applicationModify(updateCmd);

        repository.update(application);

       // DomainEventPublisher.getInstance().postAfterCommit(new ApplicationModifyEvent(updateCmd));
    }
}