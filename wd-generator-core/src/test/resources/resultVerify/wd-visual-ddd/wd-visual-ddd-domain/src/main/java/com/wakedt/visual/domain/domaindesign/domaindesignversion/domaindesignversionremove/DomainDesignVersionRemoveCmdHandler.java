package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionremove;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 删除业务域版本-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class DomainDesignVersionRemoveCmdHandler {

    @Resource
    private DomainDesignVersionRepository repository;

    public void handle(DomainDesignVersionRemoveCmd removeCmd) {
        log.info("删除业务域版本-指令处理器:{}", removeCmd);

        DomainDesignVersion domainDesignVersion = repository.find(removeCmd.getId());
        domainDesignVersion.domainDesignVersionRemove(removeCmd);

        /* TODO CheckDdVersionBindApplication(关联状态禁止删除) 业务域被应用绑定时，不允许删除 */

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.remove(domainDesignVersion);

    }
}