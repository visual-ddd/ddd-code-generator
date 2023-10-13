package com.wakedt.visual.universallanguage.app.cmd.modify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.universallanguage.domain.universallanguage.*;

/**
 * 编辑统一语言-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class UniversalLanguageModifyCmdHandler {

    @Resource
    private UniversalLanguageRepository repository;

    public void handle(UniversalLanguageModifyCmd updateCmd) {
        UniversalLanguage universalLanguage = repository.find(updateCmd.getId());
        universalLanguage.modify(updateCmd);

        repository.update(universalLanguage);
    }
}