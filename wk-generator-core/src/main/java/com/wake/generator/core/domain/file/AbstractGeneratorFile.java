package com.wake.generator.core.domain.file;

import com.wake.generator.core.constant.TemplateType;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>Title: AbstractFile</p>
 * <p>Description: 生成文件抽象类</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 14:33
 */
@Data
public abstract class AbstractGeneratorFile {

    /**
     * 文件名
     */
    private String name;

    /**
     * 文件输出全路径
     */
    private String outputUrl;

    /**
     * 文件对应的模板类型
     */
    private TemplateType templateType;

    /**
     * 获取模板路径和输出路径 key：模板路径， value：输出路径
     *
     * @return map
     */
    public Map<String, String> getTemplateMap() {
        if (StringUtils.isBlank(outputUrl)) {
            throw new IllegalArgumentException("文件输出路径不能为空！");
        }
        return Collections.singletonMap(this.templateType.getUrl(), this.outputUrl);
    }

}
