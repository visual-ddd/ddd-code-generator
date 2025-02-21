package com.wakedt.visual.bizdomain.application.domain.application;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationModifyDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationRemoveDTO;

/**
 * 应用-聚合根
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
public class Application {

    /** 应用 ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 包名 */
    private String packageName;

    /** 描述 */
    private String description;

    public void applicationModify(ApplicationModifyDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setPackageName(updateCmd.getPackageName());
        this.setDescription(updateCmd.getDescription());
    }

    public void applicationRemove(ApplicationRemoveDTO removeCmd) {
        this.setId(removeCmd.getId());
    }

}