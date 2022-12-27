package com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd.handler;

import com.wd.paas.generator.generate.generator.AbstractGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.velocity.VelocityContext;

/**
 * 指令处理器生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class CmdHandlerGenerator extends AbstractGenerator {

    @Override
    public void putVelocityContext(VelocityContext context) {
    }

}
