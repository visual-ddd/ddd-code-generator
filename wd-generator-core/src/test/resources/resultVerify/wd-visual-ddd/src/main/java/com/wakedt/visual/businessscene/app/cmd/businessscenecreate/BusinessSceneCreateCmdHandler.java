package com.wakedt.visual.businessscene.app.cmd.businessscenecreate;

import com.wakedt.visual.businessscene.domain.businessscene.BusinessScene;
import com.wakedt.visual.businessscene.domain.businessscene.BusinessSceneFactory;
import com.wakedt.visual.businessscene.domain.businessscene.BusinessSceneRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 新增业务场景-指令处理器
 */
@Component
public class BusinessSceneCreateCmdHandler {

    @Resource
    private BusinessSceneRepository repository;
    @Resource
    private BusinessSceneFactory factory;

    public Long handle(BusinessSceneCreateCmd createCmd) {
        BusinessScene entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedIdentity(标识符唯一) 校验当前团队下业务场景标识符是否重复 */

        /* TODO InitVersion(初始化起始版本) 第一次创建的同时初始化起始版本 */

        BusinessScene newEntity = repository.save(entity);
        return newEntity.getId();
    }
}