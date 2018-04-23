package com.heatdeath.service.impl;

import com.heatdeath.service.ThreadPoolService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Author:  heatdeath
 * Date:    2018/4/23
 * Desc:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadPoolServiceImplTest {

    @Autowired
    private ThreadPoolService threadPoolService;

    @Test
    public void method() throws Exception {
        threadPoolService.method();
    }

}