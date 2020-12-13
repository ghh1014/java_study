package com.ghh.proxy.cglib;

import com.ghh.proxy.jdk.ITarget;

public class TargetImpl implements ITarget {
    public void save() {
        System.out.println("save running ......");
    }
}
