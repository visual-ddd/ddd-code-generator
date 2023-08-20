package com.wakedt.visual.domain.application.applicationversion.applicationversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除应用版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationVersionRemoveCmd {

    /** 应用版本ID */
    private Long id;

}