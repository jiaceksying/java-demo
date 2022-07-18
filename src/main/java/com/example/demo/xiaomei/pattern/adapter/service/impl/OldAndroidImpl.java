package com.example.demo.xiaomei.pattern.adapter.service.impl;

import com.example.demo.xiaomei.pattern.adapter.service.OldAndroid;

/**
 * @author ksying
 * @date 2022/7/11 21:51
 */
public class OldAndroidImpl implements OldAndroid {
    @Override
    public void charge() {
        System.out.println("使用 android 充电头");
    }
}
