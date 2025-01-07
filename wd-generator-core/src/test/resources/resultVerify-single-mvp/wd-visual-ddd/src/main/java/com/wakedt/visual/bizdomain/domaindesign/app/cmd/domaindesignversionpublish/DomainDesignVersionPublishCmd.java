package com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionpublish;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesignversion.*;

/**
 * 发布业务域版本-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionPublishCmd {

    /** 业务域场景ID */
    private Long id;

}