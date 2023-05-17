package com.wakedt.visual.domain.application.application.applicationremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除应用-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRemoveCmd {

    /** 应用 ID */
    private Long id;

}