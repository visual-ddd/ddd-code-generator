package com.wakedt.visual.app.account.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedt.visual.app.account.assembler.AccountDTO2AccountDOConvert;
import com.wakedt.visual.client.account.dto.AccountDTO;
import com.wakedt.visual.client.account.query.AccountPageQuery;
import com.wakedt.visual.infrastructure.account.repository.mapper.AccountMapper;
import com.wakedt.visual.infrastructure.account.repository.model.AccountDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账号分页查询对象-查询器
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
