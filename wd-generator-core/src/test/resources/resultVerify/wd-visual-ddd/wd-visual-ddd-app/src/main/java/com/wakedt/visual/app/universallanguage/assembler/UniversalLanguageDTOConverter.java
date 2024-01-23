package com.wakedt.visual.app.universallanguage.assembler;

import cn.hutool.json.JSONUtil;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;

import java.util.List;

/**
 * 统一语言数据传输对象-查询结果集JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class UniversalLanguageDTOConverter {

    public String entity2Json(UniversalLanguageDTO entity) {
        return JSONUtil.toJsonStr(entity);
    }

    public UniversalLanguageDTO json2Entity(String value) {
        return JSONUtil.toBean(value, UniversalLanguageDTO.class);
    }

    public String list2json(List<UniversalLanguageDTO> entityList) {
        return JSONUtil.toJsonStr(entityList);
    }

    public List<UniversalLanguageDTO> json2list(String value) {
        return JSONUtil.toList(value, UniversalLanguageDTO.class);
    }

}