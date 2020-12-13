package com.ghh.proxy.jdk;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args){
        TargetImpl target = new TargetImpl();
        Advice advice = new Advice();

        ITarget proxy = (ITarget) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (invokeProxy, method, invokeArgs)->{
                    advice.before();
                    Object invoke = method.invoke(target, invokeArgs);
                    advice.afterReturning();
                    return invoke;
                });
        proxy.save();
    }
}
