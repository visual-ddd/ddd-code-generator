package com.wakedt.visual.domain.businessscene.businessscene;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate.BusinessSceneCreateCmd;

/**
 * 维护业务场景及版本的领域-聚合根-工厂
 */
@Component
public class BusinessSceneFactory {

    public BusinessScene getInstance(BusinessSceneCreateCmd createCmd) {
        BusinessScene instance = new BusinessScene();
        instance.setTeamId(createCmd.getTeamId());
        instance.setName(createCmd.getName());
        instance.setIdentity(createCmd.getIdentity());
        instance.setDescription(createCmd.getDescription());
        // TODO 指令字段不匹配 createCmd.getStartVersion();
        return instance;
    }

}
