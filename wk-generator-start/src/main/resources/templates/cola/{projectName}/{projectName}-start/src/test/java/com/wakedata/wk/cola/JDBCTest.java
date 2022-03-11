package com.wakedata.wk.cola;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JDBCTest {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testDataSource() {
        String tableName = "user";  // 替换表名
        List<Map<String, Object>> result = jdbcTemplate.queryForList("Select * from " + tableName + " limit 1");
        System.out.println(result);
    }

}