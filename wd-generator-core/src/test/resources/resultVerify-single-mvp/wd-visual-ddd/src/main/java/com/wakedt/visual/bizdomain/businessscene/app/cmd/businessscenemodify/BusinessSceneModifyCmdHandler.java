package com.wakedt.visual.bizdomain.businessscene.app.cmd.businessscenemodify;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.businessscene.domain.businessscene.*;

/**
 * 编辑业务场景-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class BusinessSceneModifyCmdHandler {

    @Resource
    private BusinessSceneRepository repository;

    public void handle(BusinessSceneModifyCmd updateCmd) {
        BusinessScene businessScene = repository.find(updateCmd.getId());
        businessScene.businessSceneModify(updateCmd);

        repository.update(businessScene);
    }
}