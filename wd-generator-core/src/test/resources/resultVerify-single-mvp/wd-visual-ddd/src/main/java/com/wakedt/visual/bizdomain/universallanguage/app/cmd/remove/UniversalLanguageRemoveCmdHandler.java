package com.wakedt.visual.bizdomain.universallanguage.app.cmd.remove;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.universallanguage.domain.universallanguage.*;

/**
 * 删除统一语言-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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