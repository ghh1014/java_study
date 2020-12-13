package com.ghh.aop;

public class TargetImpl implements ITarget {
    public void save() {
        System.out.println("save running ......");
    }
}
