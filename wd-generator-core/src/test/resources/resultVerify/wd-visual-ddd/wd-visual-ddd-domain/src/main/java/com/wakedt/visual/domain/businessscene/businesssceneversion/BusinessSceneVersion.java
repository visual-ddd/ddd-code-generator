package com.wakedt.visual.domain.businessscene.businesssceneversion;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify.BusinessSceneVersionModifyCmd;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionremove.BusinessSceneVersionRemoveCmd;
import com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate.BusinessSceneVersionDSLUpdateCmd;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish.BusinessSceneVersionPublishCmd;

/**
 * 业务场景版本-聚合根能力
 *
 * @author shimmer
 * @since 1.0
 */
public class BusinessSceneVersion extends AbstractBusinessSceneVersion {

    @Override
    public void checkLegalVersion() {
        // TODO 版本号合法(校验版本号命名是否符合标准)
    }

    @Override
    public void checkVersionPublishedException() {
        // TODO 发布锁定(当前版本发布后不能再进行任何操作)
    }

    @Override
    public void checkVersionUnPublishedException() {
        // TODO 未发布异常(当未发布时，抛出异常)
    }

    public void businessSceneVersionModify(BusinessSceneVersionModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setDescription(updateCmd.getDescription());
    }

    public void businessSceneVersionRemove(BusinessSceneVersionRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void dslUpdate(BusinessSceneVersionDSLUpdateCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setGraphDsl(updateCmd.getGraphDsl());
        this.setBusinessSceneDsl(updateCmd.getBusinessSceneDsl());
    }

    public void businessSceneVersionPublish(BusinessSceneVersionPublishCmd updateCmd) {
        this.setId(updateCmd.getId());
    }
}