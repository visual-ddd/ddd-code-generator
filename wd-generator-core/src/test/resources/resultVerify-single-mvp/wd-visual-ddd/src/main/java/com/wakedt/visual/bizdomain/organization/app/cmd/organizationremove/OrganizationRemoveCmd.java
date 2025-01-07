package com.wakedt.visual.bizdomain.organization.app.cmd.organizationremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.organization.domain.organization.*;

/**
 * 删除组织-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationRemoveCmd {

    /** 组织 ID */
    private Long id;

}