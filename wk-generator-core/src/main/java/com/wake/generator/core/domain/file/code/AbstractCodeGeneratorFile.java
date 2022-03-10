package com.wake.generator.core.domain.file.code;

import com.wake.generator.core.domain.file.AbstractGeneratorFile;
import java.util.List;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>Title: AbstractFile</p>
 * <p>Description: 代码生成文件抽象类</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 11:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class AbstractCodeGeneratorFile extends AbstractGeneratorFile {

    /**
     * 包路径
     */
    private String packagePath;

    /**
     * 需要导入的包路径集合
     */
    private Set<String> importClassSet;

    /**
     * 注解列表
     */
    private List<String> annotations;

    /**
     * 修饰符
     */
    private String modifier;

}
