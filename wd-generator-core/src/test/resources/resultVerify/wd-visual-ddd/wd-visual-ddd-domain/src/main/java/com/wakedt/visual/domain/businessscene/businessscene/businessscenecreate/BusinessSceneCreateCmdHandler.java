package com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.businessscene.businessscene.*;

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

        // TODO CheckRepeatedIdentity(标识符唯一) 校验当前团队下业务场景标识符是否重复

        // TODO InitVersion(初始化起始版本) 第一次创建的同时初始化起始版本

        BusinessScene newEntity = repository.save(entity);

//        DomainEventPublisher.getInstance().postAfterCommit(new BusinessSceneCreateEvent(createCmd));
        return newEntity.getId();
    }
}