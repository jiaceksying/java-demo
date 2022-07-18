package com.example.demo.xiaomei.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ksying
 * @date 2022/7/14 21:33
 */
public class CurrentObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Integer state = (Integer) arg;
        System.out.println(state);
    }
}
