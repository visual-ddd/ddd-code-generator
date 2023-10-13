package com.wakedt.visual.domain.businessscene.businesssceneversion;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate.BusinessSceneVersionCreateCmd;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionfork.BusinessSceneVersionForkCmd;

/**
 * 业务场景版本-聚合根-工厂
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
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
        /* TODO 指令字段不匹配 createCmd.getStartVersionId(); */
        instance.setCurrentVersion(createCmd.getCurrentVersion());
        instance.setDescription(createCmd.getDescription());
        return instance;
    }

}
