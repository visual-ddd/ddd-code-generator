package com.szy.domain.SpellGroup.DemoClass.Activity;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Cmd
 *
 * @author shimmer
 * @date 2022-03-16
 */
@Component
public class ActivityHandler {

    @Transactional(rollbackFor = Exception.class)
    public void handle(ActivityHandler cmd){

    }

}
