package com.wake.generator.application.generate.entity;

import java.util.Set;
import lombok.Data;

/**
 * 需要生成的图谱实体类
 *
 * @author ZhuXueLiang
 * @version 1.1
 * @date 2022/8/23
 */
@Data
public class GenerateChart {

    /**
     * 全局配置
     */
    private Global global;

    /**
     * 元素列表
     */
    private Set<GenerateElement> generateElements;

}
