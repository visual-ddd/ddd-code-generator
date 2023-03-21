package com.wakedt.visual.domain.organization.organization.remove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 删除组织-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationRemoveCmd {

    /** 组织 ID */
    private Long id;

}