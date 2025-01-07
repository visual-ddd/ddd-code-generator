package com.wakedt.visual.bizdomain.application.app.cmd.applicationmodify;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.application.domain.application.*;

/**
 * 编辑应用-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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