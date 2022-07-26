package com.wake.generator.infra.manage.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

/**
 * 字段属性
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:41
 * @since 1.0
 */
@Data
public class FieldDO {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 字段类型
     */
    private String type;

    /**
     * 修饰符
     */
    private String modifier;

    /**
     * 注释
     */
    private String description;

    /**
     * 注解列表
     */
    private List<String> annotations;

}
