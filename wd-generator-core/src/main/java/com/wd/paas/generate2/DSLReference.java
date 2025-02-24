package com.wd.paas.generate2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 元素引用描述
 */
@Data
@AllArgsConstructor
public class DSLReference {
    private String type; // 被引用元素类型
    private String refId; // 被引用元素ID
}