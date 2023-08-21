package com.wakedt.visual.application.app.cmd.applicationmodify;

import com.wakedt.visual.application.domain.application.Application;
import com.wakedt.visual.application.domain.application.ApplicationRepository;
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
    }
}