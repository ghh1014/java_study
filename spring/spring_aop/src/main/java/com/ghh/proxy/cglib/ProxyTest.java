package com.ghh.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class ProxyTest {
    public static void main(String[] args){

        TargetImpl target = new TargetImpl();
        Advice advice = new Advice();

        //创建增强器
        Enhancer enhancer = new Enhancer();
        //设置父类（目标）
        enhancer.setSuperclass(TargetImpl.class);
        //设置回调
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            advice.before();
            Object invoke = method.invoke(target, objects);
            advice.afterReturning();
            return invoke;
        });
        //创建代理对象
        TargetImpl proxy = (TargetImpl)enhancer.create();
        proxy.save();
    }
}
