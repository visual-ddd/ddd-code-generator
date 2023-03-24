package com.wakedt.visual.domain.universallanguage.universallanguage.remove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.universallanguage.universallanguage.*;

/**
 * 删除统一语言-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversalLanguageRemoveCmd {

    /** 统一语言 ID */
    private Long id;

}