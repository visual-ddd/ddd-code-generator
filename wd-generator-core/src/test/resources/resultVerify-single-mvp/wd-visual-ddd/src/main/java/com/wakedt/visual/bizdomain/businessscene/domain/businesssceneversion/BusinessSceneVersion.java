package com.wakedt.visual.bizdomain.businessscene.domain.businesssceneversion;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionRemoveDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPublishDTO;

/**
 * 业务场景版本-聚合根
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
public class BusinessSceneVersion {

    /** 业务场景版本ID */
    private Long id;

    /** 业务场景ID */
    private Long businessSceneId;

    /** 描述 */
    private String description;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;

    /** 业务场景DSL */
    private String businessSceneDsl;

    /** 图形DSL */
    private String graphDsl;

    /** 版本状态 */
    private Integer versionState;

    /**
     * 版本号合法
     */
    public void checkLegalVersion(){
        // TODO 版本号合法(校验版本号命名是否符合标准)
    }

    /**
     * 发布锁定
     */
    public void checkVersionPublishedException(){
        // TODO 发布锁定(当前版本发布后不能再进行任何操作)
    }

    /**
     * 未发布异常
     */
    public void checkVersionUnPublishedException(){
        // TODO 未发布异常(当未发布时，抛出异常)
    }

    public void businessSceneVersionModify(BusinessSceneVersionModifyDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setDescription(updateCmd.getDescription());
    }

    public void businessSceneVersionRemove(BusinessSceneVersionRemoveDTO removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void dslUpdate(BusinessSceneVersionDSLUpdateDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setGraphDsl(updateCmd.getGraphDsl());
        this.setBusinessSceneDsl(updateCmd.getBusinessSceneDsl());
    }

    public void businessSceneVersionPublish(BusinessSceneVersionPublishDTO updateCmd) {
        this.setId(updateCmd.getId());
    }

}