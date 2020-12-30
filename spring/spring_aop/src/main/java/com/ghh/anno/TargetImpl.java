package com.ghh.anno;

import org.springframework.stereotype.Component;

@Component("targetImpl")
public class TargetImpl implements ITarget {
    public void save() {
        //int i = 1 / 0;
        System.out.println("save running ......");
    }
}
