package com.wakedt.visual.universallanguage.app.cmd.remove;

import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguage;
import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguageRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
    }
}