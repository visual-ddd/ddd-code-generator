package com.wakedt.visual.infrastructure;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wakedata.common.mybatis.plus.po.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class BaseJpaAggregate extends BaseDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected LocalDateTime createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE, update = "now()")
    protected LocalDateTime updateTime;

    @TableField(value = "create_by", fill = FieldFill.INSERT)
    protected String createBy;

    @TableField(value = "update_by", fill = FieldFill.INSERT_UPDATE)
    protected String updateBy;

//    @Version
//    @Column(name = "version")
//    @Setter(AccessLevel.PRIVATE)
//    private Integer version;

}
