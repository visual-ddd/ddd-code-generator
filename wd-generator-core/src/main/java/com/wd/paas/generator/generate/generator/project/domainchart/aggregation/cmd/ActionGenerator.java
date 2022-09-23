package com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd;

import com.wd.paas.generator.CodeGenerate;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import lombok.Data;
import org.apache.velocity.VelocityContext;

import java.util.List;

/**
 * 动作
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Deprecated
@Data
public class ActionGenerator implements CodeGenerate {

    /**
     * 动作名
     */
    private String actionName;
    /**
     * 指令列表
     */
    private List<CmdGenerator> cmdList;
    /**
     * 事件列表
     */
    private List<CmdEventGenerator> eventList;

    @Override
    public void generate(GenerateContext generateContext) {
        this.putVelocityContext(generateContext.getContext());
        cmdList.forEach(cmd -> cmd.generate(generateContext));
        eventList.forEach(event -> event.generate(generateContext));
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.ACTION_NAME, actionName.toLowerCase());
    }

    @Override
    public String[] getElementTypeUrl() {
        return new String[0];
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return null;
    }

}
