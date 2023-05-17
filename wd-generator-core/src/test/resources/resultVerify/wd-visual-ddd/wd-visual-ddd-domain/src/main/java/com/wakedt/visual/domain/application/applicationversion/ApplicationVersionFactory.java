package com.wakedt.visual.domain.application.applicationversion;

import com.wakedt.visual.domain.application.applicationversion.applicationversioncreate.ApplicationVersionCreateCmd;
import com.wakedt.visual.domain.application.applicationversion.applicationversionfork.ApplicationVersionForkCmd;
import org.springframework.stereotype.Component;

/**
 * 应用版本-聚合根-工厂
 */
@Component
public class ApplicationVersionFactory {

    public ApplicationVersion getInstance(ApplicationVersionCreateCmd createCmd) {
        ApplicationVersion instance = new ApplicationVersion();
        instance.setApplicationId(createCmd.getApplicationId());
        instance.setStartVersion(createCmd.getStartVersion());
        instance.setCurrentVersion(createCmd.getCurrentVersion());
        instance.setDescription(createCmd.getDescription());
        return instance;
    }

    public ApplicationVersion getInstance(ApplicationVersionForkCmd createCmd) {
        ApplicationVersion instance = new ApplicationVersion();
        /* TODO 指令字段不匹配 createCmd.getStartVersionId(); */
        instance.setCurrentVersion(createCmd.getCurrentVersion());
        instance.setDescription(createCmd.getDescription());
        return instance;
    }

}
