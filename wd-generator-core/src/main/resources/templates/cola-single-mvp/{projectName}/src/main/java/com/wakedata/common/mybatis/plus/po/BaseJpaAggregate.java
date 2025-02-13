package com.wakedata.common.mybatis.plus.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 封装公共DO字段，并添加JPA相关注解
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class BaseJpaAggregate extends BaseDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    @Column(name = "create_time", columnDefinition = "datetime COMMENT '创建时间'")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected LocalDateTime createTime;

    @Column(name = "update_time", columnDefinition = "datetime COMMENT '更新时间'")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    protected LocalDateTime updateTime;

    @Column(columnDefinition = "varchar(40) COMMENT '创建人'")
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    protected String createBy;

    @Column(columnDefinition = "varchar(40) COMMENT '更新人'")
    @TableField(value = "update_by", fill = FieldFill.INSERT_UPDATE)
    protected String updateBy;

}

