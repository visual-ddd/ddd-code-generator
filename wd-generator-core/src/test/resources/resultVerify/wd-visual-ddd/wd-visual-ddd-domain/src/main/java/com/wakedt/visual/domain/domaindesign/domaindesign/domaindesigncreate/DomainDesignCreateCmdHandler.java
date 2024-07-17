package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesigncreate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.domaindesign.domaindesign.*;

/**
 * 新增业务域-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class DomainDesignCreateCmdHandler {

    @Resource
    private DomainDesignRepository repository;
    @Resource
    private DomainDesignFactory factory;

    public Long handle(DomainDesignCreateCmd createCmd) {
        log.info("新增业务域-指令处理器:{}", createCmd);

        DomainDesign entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedIdentity(标识符唯一) 校验当前团队下业务域标识符是否重复 */

        /* TODO InitVersion(初始化版本) 第一次创建的同时初始化起始版本 */

        DomainDesign newEntity = repository.save(entity);

        return newEntity.getId();
    }
}