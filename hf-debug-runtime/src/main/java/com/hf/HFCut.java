package com.hf;




import android.app.Application;

import com.didichuxing.doraemonkit.DoraemonKit;
import com.hf.HfSwitch;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class HFCut {

    @Pointcut("execution(@HfSwitch * *(..))")

    public void addDidiKit() {}


    @Around("addDidiKit()")
    public void insertDidiKit(final ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        HfSwitch hfSwitch = methodSignature.getMethod()
                .getAnnotation(HfSwitch.class);
        if (hfSwitch.needEnableDidi()){
            DoraemonKit.install((Application) joinPoint.getThis());
        }
    }
}
