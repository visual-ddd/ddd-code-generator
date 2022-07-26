package com.wake.generator.infra.manage.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 故事节点
 *
 * @author ZhuXueLiang
 * @date 2022/7/18
 * @since 1.0
 */
@Data
public class StoryNodeDo {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 包名
     */
    private String packageName;

    /**
     * 领域图谱id
     */
    private Long chartId;

}