package com.wakedt.visual.domain.businessscene.businessscene;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate.BusinessSceneCreateCmd;

/**
 * 业务场景-聚合根-工厂
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
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
