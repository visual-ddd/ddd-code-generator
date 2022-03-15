package com.wakedata.wk.cola;

import com.alibaba.fastjson.JSONObject;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.mq.annotation.EnableMessageCenter;
import com.wakedata.wk.cola.adapter.spellgroup.web.WebSpellGroupActivityController;
import com.wakedata.wk.cola.app.spellgroup.query.WebSpellGroupActivityPageQueryExe;
import com.wakedata.wk.cola.app.spellgroup.query.module.WebViewSpellGroupActivityListVO;
import com.wakedata.wk.cola.client.spellgroup.query.WebSpellGroupActivityPageQuery;
import com.wakedata.wk.cola.domain.spellgroup.activity.create.SpellGroupActivityCreateCmd;
import com.wakedata.wk.cola.domain.spellgroup.activity.create.SpellGroupActivityCreateCmdHandler;
import com.wakedata.wk.cola.domain.spellgroup.activity.remove.SpellGroupActivityRemoveCmdHandler;
import com.wakedata.wk.cola.start.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootApplication(scanBasePackages = {"com.wakedata.wk.cola", "com.alibaba.cola","com.wakedata.common.es"})
@MapperScan("com.wakedata.wk.cola.infra.*.repository")
@EnableMessageCenter
public class TestApplication {

    @Autowired
    private SpellGroupActivityCreateCmdHandler spellGroupActivityCreateCmdHandler;

    @Autowired
    private WebSpellGroupActivityPageQueryExe webSpellGroupActivityPageQueryExe;

    // 创建拼团活动
    @Test
    public void createActivity() {
        SpellGroupActivityCreateCmd cmd = new SpellGroupActivityCreateCmd();
        cmd.setEpId(11144L);
        cmd.setAppId(22234L);
        cmd.setActivityName("单元测试107");

        cmd.setActivityEndTime(LocalDateTime.now().plusHours(24));
        cmd.setItemNo(222132L);
        cmd.setActivityStartTime(LocalDateTime.now());
        cmd.setEnableRobot(1);
        cmd.setStoreNo(2212L);
        cmd.setGroupType(1);
        cmd.setImageUrl("http://www.baidu.com");
        cmd.setLeaderProm(1L);
        cmd.setDuration(2);
        cmd.setVirtualCount(11);
        cmd.setLimitItemCount(123);
        cmd.setLimitTimes(21);


        spellGroupActivityCreateCmdHandler.handle(cmd);
    }

    // 查询es数据
    @Test
    public void queryEs() {
        WebSpellGroupActivityPageQuery query = new WebSpellGroupActivityPageQuery();
//        query.setAppId(22L);
        query.setActivityName("单测试");
        query.setPageNo(1);
        query.setPageSize(10);
        PageResultDTO<List<WebViewSpellGroupActivityListVO>> handle = webSpellGroupActivityPageQueryExe.handle(query);

        System.out.println("queryEs------"+JSONObject.toJSONString(handle));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
