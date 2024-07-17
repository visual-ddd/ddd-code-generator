package com.wakedt.visual.domain.application.application.applicationmodify;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.application.*;

/**
 * 编辑应用-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class ApplicationModifyCmdHandler {

    @Resource
    private ApplicationRepository repository;

    public void handle(ApplicationModifyCmd updateCmd) {
        log.info("编辑应用-指令处理器:{}", updateCmd);

        Application application = repository.find(updateCmd.getId());
        application.applicationModify(updateCmd);

        repository.update(application);

    }
}