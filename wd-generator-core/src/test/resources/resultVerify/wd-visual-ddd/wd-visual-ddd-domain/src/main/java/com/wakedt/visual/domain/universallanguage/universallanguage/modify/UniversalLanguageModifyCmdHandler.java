package com.wakedt.visual.domain.universallanguage.universallanguage.modify;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.universallanguage.universallanguage.*;

/**
 * 编辑统一语言-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class UniversalLanguageModifyCmdHandler {

    @Resource
    private UniversalLanguageRepository repository;

    public void handle(UniversalLanguageModifyCmd updateCmd) {
        log.info("编辑统一语言-指令处理器:{}", updateCmd);

        UniversalLanguage universalLanguage = repository.find(updateCmd.getId());
        universalLanguage.modify(updateCmd);

        repository.update(universalLanguage);

    }
}