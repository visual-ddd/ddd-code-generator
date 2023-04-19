package com.wakedt.visual.domain.application.applicationversion.applicationversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.application.applicationversion.*;

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