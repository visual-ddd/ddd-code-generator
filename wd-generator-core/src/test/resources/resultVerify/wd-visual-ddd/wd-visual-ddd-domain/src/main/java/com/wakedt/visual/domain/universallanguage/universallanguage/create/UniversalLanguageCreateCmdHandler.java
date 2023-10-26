package com.wakedt.visual.domain.universallanguage.universallanguage.create;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.universallanguage.universallanguage.*;

/**
 * 新增统一语言-指令处理器
 *
 * @author shimmer
 * @since 1.0
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