package com.wake.generator.core.domain.file.code;

import com.wake.generator.core.domain.Method;
import java.util.List;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>Title: InterfaceDTO</p>
 * <p>Description: 接口dto</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 10:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceFile extends AbstractCodeFile {

    /**
     * 继承的接口类
     */
    private Set<InterfaceFile> extendsInterfaceSet;

    /**
     * 方法列表
     */
    private List<Method> methodList;

}
