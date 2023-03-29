package com.wakedt.visual.domain.businessscene.businesssceneversion;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate.BusinessSceneVersionCreateCmd;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionfork.BusinessSceneVersionForkCmd;

/**
 * 描述业务场景版本信息-聚合根-工厂
 */
@Component
public class BusinessSceneVersionFactory {

    public BusinessSceneVersion getInstance(BusinessSceneVersionCreateCmd createCmd) {
        BusinessSceneVersion instance = new BusinessSceneVersion();
        instance.setBusinessSceneId(createCmd.getBusinessSceneId());
        instance.setDescription(createCmd.getDescription());
        instance.setStartVersion(createCmd.getStartVersion());
        instance.setCurrentVersion(createCmd.getCurrentVersion());
        return instance;
    }

    public BusinessSceneVersion getInstance(BusinessSceneVersionForkCmd createCmd) {
        BusinessSceneVersion instance = new BusinessSceneVersion();
        instance.setStartVersionId(createCmd.getStartVersionId());
        instance.setCurrentVersion(createCmd.getCurrentVersion());
        instance.setDescription(createCmd.getDescription());
        return instance;
    }

}
