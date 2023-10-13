package com.wakedt.visual.businessscene.app.cmd.businessscenecreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.businessscene.domain.businessscene.*;

/**
 * 新增业务场景-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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