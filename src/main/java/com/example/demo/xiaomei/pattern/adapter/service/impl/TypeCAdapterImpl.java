package com.example.demo.xiaomei.pattern.adapter.service.impl;

import com.example.demo.xiaomei.pattern.adapter.service.Lightning;
import com.example.demo.xiaomei.pattern.adapter.service.OldAndroid;
import com.example.demo.xiaomei.pattern.adapter.service.TypeC;

/**
 * @author ksying
 * @date 2022/7/11 22:03
 */
public class TypeCAdapterImpl implements TypeC {
    private OldAndroid oldAndroid;
    private Lightning lightning;

    public TypeCAdapterImpl(OldAndroid oldAndroid) {
        this.oldAndroid = oldAndroid;
    }

    public TypeCAdapterImpl(Lightning lightning) {
        this.lightning = lightning;
    }

    @Override
    public void charge() {
        oldAndroid.charge();

    }
}
