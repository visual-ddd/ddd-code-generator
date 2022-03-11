package com.wake.generator.application.domain;

import java.util.List;
import lombok.Data;

/**
 * <p>Title: LabelDTO</p>
 * <p>Description: 项目信息</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 10:06
 */
@Data
public class Project {

    /**
     * 全局配置
     */
    private Global global;

    /**
     * 元素信息列表
     */
    private List<DomainElement> domainElementList;

}
