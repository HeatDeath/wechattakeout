package com.heatdeath.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Author:  heatdeath
 * Date:    2018/4/23
 * Desc:
 */
@Aspect
@Component
@Slf4j
public class CountRunTime {

    @Pointcut("execution(public * com.heatdeath.service.impl.ThreadPoolServiceImpl.*(..))")
    public void verify() {
    }

    @Around("verify()")
    public void count(ProceedingJoinPoint point) throws Throwable {
        Long startTime = System.currentTimeMillis();
        Integer result = (Integer) point.proceed();

        Long endTime = System.currentTimeMillis();
        log.info("--------------------------------------------------");
        log.info("run time is {}", endTime - startTime);
        log.info("point.getTarget() {}", point.getTarget().toString());
        log.info("point.getSignature() {}", point.getSignature().toString());
        log.info("point.getThis() {}", point.getThis().toString());
        log.info("point.getKind() {}", point.getKind());
        log.info("point.getSourceLocation() {}", point.getSourceLocation());
        log.info("point.getArgs() {}", point.getArgs());


    }
}
