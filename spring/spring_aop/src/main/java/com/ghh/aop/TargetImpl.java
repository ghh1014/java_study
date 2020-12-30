package com.ghh.aop;

public class TargetImpl implements ITarget {
    public void save() {
        //int i = 1 / 0;
        System.out.println("save running ......");
    }
}
