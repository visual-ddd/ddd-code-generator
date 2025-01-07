package com.wakedt.visual.bizdomain.application.app.cmd.businesssceneversionbind;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.application.domain.applicationversion.*;

/**
 * 关联业务场景版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class BusinessSceneVersionBindCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;

    public void handle(BusinessSceneVersionBindCmd updateCmd) {
        ApplicationVersion applicationVersion = repository.find(updateCmd.getId());
        applicationVersion.businessSceneVersionBind(updateCmd);

        /* TODO CheckExistBusinessSceneVersionVersionIds(业务场景版本号合法) 校验业务场景版本号是否存在 */

        /* TODO CheckBindRepeatedBusinessSceneVersion(业务场景版本号唯一) 关联的同一业务场景只能关联一个版本号 */

        /* TODO CheckUnpublishedBsVersionHasBindOther(关联锁定未发布的业务场景版本号) 未发布的业务场景同一个版本只能关联一个应用 */

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(applicationVersion);
    }
}