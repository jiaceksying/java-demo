package com.example.demo.xiaomei.pattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.Observable;

/**
 * @author ksying
 * @date 2022/7/14 21:30
 */
public class Subject extends Observable {
    private Integer state;

    public Subject(Integer state) {
        this.state = state;
    }

    public void setState(Integer state) {
        this.state = state;
        this.setChanged();
        this.notifyObservers(state);
    }
}
