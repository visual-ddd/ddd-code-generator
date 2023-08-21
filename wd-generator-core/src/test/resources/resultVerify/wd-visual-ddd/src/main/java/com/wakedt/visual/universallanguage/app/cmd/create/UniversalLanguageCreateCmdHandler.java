package com.wakedt.visual.universallanguage.app.cmd.create;

import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguage;
import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguageFactory;
import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguageRepository;
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
        return newEntity.getId();
    }
}