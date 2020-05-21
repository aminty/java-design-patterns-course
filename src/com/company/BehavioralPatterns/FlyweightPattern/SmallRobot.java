package com.company.BehavioralPatterns.FlyweightPattern;

import jdk.jshell.spi.ExecutionControl;

public class SmallRobot implements RobotInterface {
    @Override
    public void print() {
        System.out.println("This is a small robot.");
    }

    @Override
    public void setColor(String colorOfRobot) {

    }
}
