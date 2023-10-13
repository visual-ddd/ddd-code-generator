package com.wakedt.visual.domain.account.account.accountremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

/**
 * 删除账号-指令
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDeleteCmd {

    /** 用户 ID */
    private Long id;

}