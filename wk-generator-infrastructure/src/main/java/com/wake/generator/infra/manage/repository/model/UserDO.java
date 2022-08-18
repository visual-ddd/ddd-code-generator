package com.wake.generator.infra.manage.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("paas_code_generator_user")
public class UserDO {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private String userName;

    private String password;

}
