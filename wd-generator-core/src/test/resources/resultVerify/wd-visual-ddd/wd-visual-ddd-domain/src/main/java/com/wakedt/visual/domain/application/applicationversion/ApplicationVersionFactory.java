package com.wakedt.visual.domain.application.applicationversion;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.application.applicationversion.applicationversioncreate.ApplicationVersionCreateCmd;
import com.wakedt.visual.domain.application.applicationversion.applicationversionfork.ApplicationVersionForkCmd;

/**
 * 描述应用版本信息-聚合根-工厂
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
        instance.setStartVersionId(createCmd.getStartVersionId());
        instance.setCurrentVersion(createCmd.getCurrentVersion());
        instance.setDescription(createCmd.getDescription());
        return instance;
    }

}
