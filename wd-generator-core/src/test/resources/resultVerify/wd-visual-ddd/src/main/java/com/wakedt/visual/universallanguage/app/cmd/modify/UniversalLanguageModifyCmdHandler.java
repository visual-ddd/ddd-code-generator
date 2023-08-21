package com.wakedt.visual.universallanguage.app.cmd.modify;

import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguage;
import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguageRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 编辑统一语言-指令处理器
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