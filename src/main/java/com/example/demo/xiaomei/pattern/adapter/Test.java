package com.example.demo.xiaomei.pattern.adapter;

import com.example.demo.xiaomei.pattern.adapter.service.impl.OldAndroidImpl;
import com.example.demo.xiaomei.pattern.adapter.service.impl.TypeCAdapterImpl;
import com.example.demo.xiaomei.pattern.adapter.service.OldAndroid;
import com.example.demo.xiaomei.pattern.adapter.service.TypeC;

/**
 * @author ksying
 * @date 2022/7/11 21:52
 */
public class Test {
    public static void main(String[] args) {
        // 适配器模式
        OldAndroid oldAndroid = new OldAndroidImpl();
        TypeC typeC = new TypeCAdapterImpl(oldAndroid);
        typeC.charge();

    }
}
