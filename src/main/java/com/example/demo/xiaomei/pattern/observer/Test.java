package com.example.demo.xiaomei.pattern.observer;

import java.util.Observer;

/**
 * @author ksying
 * @date 2022/7/14 21:34
 */
public class Test {
    public static void main(String[] args) {
        // 观察者模式
        Subject subject = new Subject(0);
        Observer observer = new CurrentObserver();
        subject.addObserver(observer);
        subject.setState(1);
        subject.setState(2);
    }
}
