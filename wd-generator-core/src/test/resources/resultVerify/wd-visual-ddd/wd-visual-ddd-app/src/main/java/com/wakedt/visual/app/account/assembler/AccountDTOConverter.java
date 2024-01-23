package com.wakedt.visual.app.account.assembler;

import cn.hutool.json.JSONUtil;
import java.util.List;
import com.wakedt.visual.client.account.dto.AccountDTO;

/**
 * 账号数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class AccountDTOConverter {

    public String entity2Json(AccountDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public AccountDTO json2Entity(String value) {
        return JSONUtil.toBean(value, AccountDTO.class);
    }

    public String list2json(List<AccountDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<AccountDTO> json2list(String value) {
        return JSONUtil.toList(value, AccountDTO.class);
    }

}