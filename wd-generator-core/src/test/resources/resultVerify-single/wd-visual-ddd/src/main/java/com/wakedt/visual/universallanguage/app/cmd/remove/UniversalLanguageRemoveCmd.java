package com.wakedt.visual.universallanguage.app.cmd.remove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.universallanguage.domain.universallanguage.*;

/**
 * 删除统一语言-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversalLanguageRemoveCmd {

    /** 统一语言 ID */
    private Long id;

}