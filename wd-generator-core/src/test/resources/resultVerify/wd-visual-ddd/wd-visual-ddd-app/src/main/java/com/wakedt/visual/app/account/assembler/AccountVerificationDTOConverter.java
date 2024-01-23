package com.wakedt.visual.app.account.assembler;

import cn.hutool.json.JSONUtil;
import java.util.List;
import com.wakedt.visual.client.account.dto.AccountVerificationDTO;

/**
 * 账号验证码数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class AccountVerificationDTOConverter {

    public String entity2Json(AccountVerificationDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public AccountVerificationDTO json2Entity(String value) {
        return JSONUtil.toBean(value, AccountVerificationDTO.class);
    }

    public String list2json(List<AccountVerificationDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<AccountVerificationDTO> json2list(String value) {
        return JSONUtil.toList(value, AccountVerificationDTO.class);
    }

}