package com.wakedt.visual.domain.universallanguage.universallanguage.remove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.universallanguage.universallanguage.*;

/**
 * 删除统一语言-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UniversalLanguageRemoveCmdEvent extends BaseDomainEvent {
    
    /** 统一语言 ID */
    private Long id;
    
    public UniversalLanguageRemoveCmdEvent() {}

    public UniversalLanguageRemoveCmdEvent(UniversalLanguageRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.universallanguage.universallanguage.remove}";
    }
}
