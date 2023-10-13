package com.wakedt.visual.domain.application.application;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.application.application.applicationmodify.ApplicationModifyCmd;
import com.wakedt.visual.domain.application.application.applicationremove.ApplicationRemoveCmd;

/**
 * 应用-聚合根能力
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public class Application extends AbstractApplication {

    public void applicationModify(ApplicationModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setPackageName(updateCmd.getPackageName());
        this.setDescription(updateCmd.getDescription());
    }

    public void applicationRemove(ApplicationRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }
}