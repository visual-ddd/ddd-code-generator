package com.wd.paas.generator.web.infrastructure.codegen.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedata.common.mybatis.plus.po.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 领域图谱实体类
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("paas_code_generator_domain")
public class DomainChartDO extends BaseDO {

    /** 领域图谱id */
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 项目id */
    private Long projectId;

    /** 领域名 */
    private String domainName;

    /** 领域描述 */
    private String domainDesc;

    /** 图谱xml存储URL地址 */
    private String fileKey;

    /** 领域作者 */
    private String domainAuthor;

}
