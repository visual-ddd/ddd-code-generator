package com.wakedt.visual.bizdomain.universallanguage.app.cmd.remove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.universallanguage.domain.universallanguage.*;

/**
 * 删除统一语言-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversalLanguageRemoveCmd {

    /** 统一语言 ID */
    private Long id;

}