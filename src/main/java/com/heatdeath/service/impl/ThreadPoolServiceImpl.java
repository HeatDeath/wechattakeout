package com.heatdeath.service.impl;

import com.heatdeath.service.ThreadPoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author:  heatdeath
 * Date:    2018/4/23
 * Desc:
 */
@Service
@Slf4j
public class ThreadPoolServiceImpl implements ThreadPoolService {
    @Override
    public Integer method() throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.execute(() -> log.info("task:{}", index));
        }
        executorService.shutdown();

        Thread.sleep(100);
        return 1;
    }
}
