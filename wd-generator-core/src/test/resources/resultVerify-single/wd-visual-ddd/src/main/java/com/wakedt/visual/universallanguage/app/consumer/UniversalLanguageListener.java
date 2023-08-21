package com.wakedt.visual.universallanguage.app.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.universallanguage.app.cmd.create.UniversalLanguageCreateCmdHandler;
import com.wakedt.visual.universallanguage.app.cmd.modify.UniversalLanguageModifyCmdHandler;
import com.wakedt.visual.universallanguage.app.cmd.remove.UniversalLanguageRemoveCmdHandler;

import javax.annotation.Resource;

/**
 * UniversalLanguage - 事件订阅
 */
@Slf4j
@Component
public class UniversalLanguageListener {

}