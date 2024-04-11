package com.lilin.config;

import com.plumelog.trace.aspect.AbstractAspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by LILIN on 2024/3/6/20:00:46
 */
//@Aspect
//@Component
public class AspectConfig extends AbstractAspect {
    @Around("within(com.lilin.controller..*))")
    public Object around(JoinPoint joinPoint) throws Throwable {
        return aroundExecute(joinPoint);
    }
}
