package com.zdd.factory;

import jdk.internal.cmm.SystemResourcePressureImpl;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
