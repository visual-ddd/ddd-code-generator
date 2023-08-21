package com.wakedt.visual.app.universallanguage.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.universallanguage.universallanguage.create.UniversalLanguageCreateCmdHandler;
import com.wakedt.visual.domain.universallanguage.universallanguage.modify.UniversalLanguageModifyCmdHandler;
import com.wakedt.visual.domain.universallanguage.universallanguage.remove.UniversalLanguageRemoveCmdHandler;

import javax.annotation.Resource;

/**
 * UniversalLanguage - 事件订阅
 */
@Slf4j
@Component
public class UniversalLanguageListener {

}