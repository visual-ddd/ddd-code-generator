package com.wakedt.visual.domain.application.application.applicationmodify;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.application.*;

/**
 * 编辑应用-指令处理器
 *
 * @author shimmer
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