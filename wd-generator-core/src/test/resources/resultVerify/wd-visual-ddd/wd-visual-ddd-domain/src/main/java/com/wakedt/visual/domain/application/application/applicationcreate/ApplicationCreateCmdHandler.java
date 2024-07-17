package com.wakedt.visual.domain.application.application.applicationcreate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.application.*;

/**
 * 新增应用-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class ApplicationCreateCmdHandler {

    @Resource
    private ApplicationRepository repository;
    @Resource
    private ApplicationFactory factory;

    public Long handle(ApplicationCreateCmd createCmd) {
        log.info("新增应用-指令处理器:{}", createCmd);

        Application entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedIdentity(标识符唯一) 校验当前团队下标识符是否重复 */

        /* TODO InitVersion(初始化版本) 第一次创建的同时初始化起始版本 */

        Application newEntity = repository.save(entity);

        return newEntity.getId();
    }
}