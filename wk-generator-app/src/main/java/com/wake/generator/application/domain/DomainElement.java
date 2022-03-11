package com.wake.generator.application.domain;


import com.wake.generator.application.constant.DomainElementType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>Description: 元素信息</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 10:02
 */
@Slf4j
@Data
public class DomainElement {

    /**
     * 名称
     */
    private String name;

    /**
     * 输出全路径
     */
    private String outputDir;

    /**
     * 参数列表
     */
    private List<Field> fieldList;

    /**
     * 方法列表
     */
    private List<Method> methodList;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 元素类型
     */
    private DomainElementType elementType;

    //=============================================
    /**
     * 包路径
     */
    private String packagePath;

    /**
     * 生成类需要导入的包路径
     */
    private Set<String> importClassSet;

    /**
     * 获取输入路径和文件输出路径 Map
     *
     * @return 输入输出路径map
     */
    public Map<String, String> getTemplateMap() {
        Map<String, String> templateMap = new HashMap<>(8);
        for (String url : elementType.getTemplateUrlSet()) {
            String outFileName = url.replaceAll("^[\\s\\S]*[\\\\/]", "");
            outFileName = outFileName.replace(elementType.getName(), name).replace(".vm", "");
            String outputPath = outputDir + outFileName;
            templateMap.put(url, outputPath);
        }
        return templateMap;
    }

}
