package com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionmodify;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.businessscene.domain.businesssceneversion.*;

/**
 * 编辑业务场景版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class BusinessSceneVersionModifyCmdHandler {

    @Resource
    private BusinessSceneVersionRepository repository;

    public void handle(BusinessSceneVersionModifyCmd updateCmd) {
        BusinessSceneVersion businessSceneVersion = repository.find(updateCmd.getId());
        businessSceneVersion.businessSceneVersionModify(updateCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(businessSceneVersion);
    }
}