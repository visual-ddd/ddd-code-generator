package com.wakedt.visual.domain.universallanguage.universallanguage.remove;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.universallanguage.universallanguage.*;

/**
 * 删除统一语言-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class UniversalLanguageRemoveCmdHandler {

    @Resource
    private UniversalLanguageRepository repository;

    public void handle(UniversalLanguageRemoveCmd removeCmd) {
        log.info("删除统一语言-指令处理器:{}", removeCmd);

        UniversalLanguage universalLanguage = repository.find(removeCmd.getId());
        universalLanguage.remove(removeCmd);

        repository.remove(universalLanguage);

    }
}