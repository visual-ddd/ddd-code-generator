package com.wakedt.visual.domain.application.application;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.application.application.applicationcreate.ApplicationCreateCmd;

/**
 * 维护应用及版本的领域-聚合根-工厂
 */
@Component
public class ApplicationFactory {

    public Application getInstance(ApplicationCreateCmd createCmd) {
        Application instance = new Application();
        instance.setTeamId(createCmd.getTeamId());
        instance.setName(createCmd.getName());
        instance.setIdentity(createCmd.getIdentity());
        instance.setPackageName(createCmd.getPackageName());
        instance.setDescription(createCmd.getDescription());
        instance.setStartVersion(createCmd.getStartVersion());
        return instance;
    }

}
