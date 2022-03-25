package com.szy.domain.SpellGroup.DemoClass.DemoClassCreateEvent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 事件类
 *
 * @author shimmer
 * @date 2022-03-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DemoClassCreateEvent  {

    @Override
    public String eventCode() {
        //自定义eventCode，不能为空，需要符合既定格式，查看父类可以看到正则校验
        //统一放在‘common-event-code.yml’中，本地直接通过spring el表达式获取，例如：organization.attribute.create.event-code}
        return null;
    }

}
