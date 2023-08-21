package com.wakedt.visual.application.domain.application;

import com.wakedt.visual.application.app.cmd.applicationcreate.ApplicationCreateCmd;
import org.springframework.stereotype.Component;

/**
 * 应用-聚合根-工厂
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
        /* TODO 指令字段不匹配 createCmd.getStartVersion(); */
        return instance;
    }

}
