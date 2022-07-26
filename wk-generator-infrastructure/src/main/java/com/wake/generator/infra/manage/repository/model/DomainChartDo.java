package com.wake.generator.infra.manage.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 项目图谱实体类
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:47
 * @since 1.0
 */
@Data
@TableName("domain_chart_new")
public class DomainChartDo {

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
     * 作者
     */
    private String author;

    /**
     * 创建时间
     */
    private LocalDateTime dateTime;

    /**
     * 领域包名
     */
    private String filed;

    /**
     * 项目id
     */
    private Long projectId;

    /**
     * 图形信息json
     */
    private String jsonInfo;

}
