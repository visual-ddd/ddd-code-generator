package com.wakedt.visual.application.domain.applicationversion;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.application.app.cmd.applicationversioncreate.ApplicationVersionCreateCmd;
import com.wakedt.visual.application.app.cmd.applicationversionfork.ApplicationVersionForkCmd;

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
