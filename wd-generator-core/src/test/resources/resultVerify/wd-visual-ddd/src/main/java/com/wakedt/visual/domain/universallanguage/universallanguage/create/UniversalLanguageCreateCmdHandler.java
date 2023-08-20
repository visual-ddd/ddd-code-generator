package com.wakedt.visual.domain.universallanguage.universallanguage.create;

import com.wakedt.visual.domain.universallanguage.universallanguage.UniversalLanguage;
import com.wakedt.visual.domain.universallanguage.universallanguage.UniversalLanguageFactory;
import com.wakedt.visual.domain.universallanguage.universallanguage.UniversalLanguageRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 新增统一语言-指令处理器
 */
@Component
public class UniversalLanguageCreateCmdHandler {

    @Resource
    private UniversalLanguageRepository repository;
    @Resource
    private UniversalLanguageFactory factory;

    public Long handle(UniversalLanguageCreateCmd createCmd) {
        UniversalLanguage entity = factory.getInstance(createCmd);

        UniversalLanguage newEntity = repository.save(entity);

       // DomainEventPublisher.getInstance().postAfterCommit(new UniversalLanguageCreateEvent(createCmd));
        return newEntity.getId();
    }
}