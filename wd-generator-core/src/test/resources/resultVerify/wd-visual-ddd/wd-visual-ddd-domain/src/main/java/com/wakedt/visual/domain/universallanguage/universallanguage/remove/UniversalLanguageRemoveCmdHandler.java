package com.wakedt.visual.domain.universallanguage.universallanguage.remove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.universallanguage.universallanguage.*;

/**
 * 删除统一语言-指令处理器
 */
@Component
public class UniversalLanguageRemoveCmdHandler {

    @Resource
    private UniversalLanguageRepository repository;

    public void handle(UniversalLanguageRemoveCmd removeCmd) {
        UniversalLanguage universalLanguage = repository.find(removeCmd.getId());
        universalLanguage.remove(removeCmd);
        repository.remove(universalLanguage);

//        DomainEventPublisher.getInstance().postAfterCommit(new UniversalLanguageRemoveEvent(removeCmd));
    }
}