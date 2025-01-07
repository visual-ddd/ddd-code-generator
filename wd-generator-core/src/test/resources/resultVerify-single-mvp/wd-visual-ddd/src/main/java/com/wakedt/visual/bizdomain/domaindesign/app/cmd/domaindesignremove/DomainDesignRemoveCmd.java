package com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign.*;

/**
 * 删除业务域-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignRemoveCmd {

    /** 业务域 ID */
    private Long id;

}