package com.szy.domain.SpellGroup.DemoClass.DemoClassCreateCmd;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Cmd
 *
 * @author shimmer
 * @date 2022-03-25
 */
@Component
public class DemoClassCreateCmdHandler {

    @Transactional(rollbackFor = Exception.class)
    public void handle(DemoClassCreateCmdHandler cmd){

    }

}
