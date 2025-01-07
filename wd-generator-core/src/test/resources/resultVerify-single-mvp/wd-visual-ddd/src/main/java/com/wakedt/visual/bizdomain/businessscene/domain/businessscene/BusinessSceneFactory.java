package com.wakedt.visual.bizdomain.businessscene.domain.businessscene;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businessscenecreate.BusinessSceneCreateCmd;

/**
 * 业务场景-聚合根-工厂
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class BusinessSceneFactory {

    public BusinessScene getInstance(BusinessSceneCreateCmd createCmd) {
        BusinessScene instance = new BusinessScene();
        instance.setTeamId(createCmd.getTeamId());
        instance.setName(createCmd.getName());
        instance.setIdentity(createCmd.getIdentity());
        instance.setDescription(createCmd.getDescription());
        /* TODO 指令字段不匹配 createCmd.getStartVersion(); */
        return instance;
    }

}
