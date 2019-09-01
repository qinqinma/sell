package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author MQQ
 * @title: LoggerTest
 * @projectName sell
 * @description: TODO
 * @date 2019/8/2914:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1(){
        String name="imooc";
        String password ="123456";
        log.info("name: {},password: {}",name,password);
        log.debug("debug....");
        log.error("error...");
        log.warn("warn....");
    }
}
