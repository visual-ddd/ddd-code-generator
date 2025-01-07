package com.wakedt.visual.bizdomain.universallanguage.app.cmd.modify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.universallanguage.domain.universallanguage.*;

/**
 * 编辑统一语言-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversalLanguageModifyCmd {

    /** 统一语言 ID */
    private Long id;

    /** 概念 */
    private String conception;

    /** 英文名 */
    private String englishName;

    /** 定义 */
    private String definition;

    /** 约束 */
    private String restraint;

    /** 举例 */
    private String example;

    /** 所属唯一标识 */
    private Long identity;

}