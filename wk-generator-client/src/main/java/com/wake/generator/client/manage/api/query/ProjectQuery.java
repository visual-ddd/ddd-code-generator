package com.wake.generator.client.manage.api.query;

import com.wakedata.common.core.dto.PageQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProjectQuery extends PageQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 所属用户ID
     */
    private Long userId;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String projectName;

    /**
     * 分组包名
     */
    private String groupPackage;

    /**
     * 版本号
     */
    private String projectVersion;

}
