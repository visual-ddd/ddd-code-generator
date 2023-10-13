package com.wakedt.visual.account.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.account.client.query.AccountPageQuery;
import com.wakedt.visual.account.infrastructure.repository.model.AccountDO;
import com.wakedt.visual.account.infrastructure.repository.mapper.AccountMapper;
import com.wakedt.visual.account.client.dto.AccountDTO;
import com.wakedt.visual.account.app.assembler.AccountDTO2AccountDOConvert;

/**
 * 账号分页查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Component
public class AccountPageQueryExe {

    @Resource
    private AccountMapper mapper;

    public PageResultDTO<List<AccountDTO>> execute(AccountPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<AccountDO> pageInfo = new PageInfo<>(mapper.accountPageQuery(pageQuery));
        PageResultDTO<List<AccountDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(AccountDTO2AccountDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
