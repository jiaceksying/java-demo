package com.example.demo.xiaomei.pattern.adapter.service.impl;

import com.example.demo.xiaomei.pattern.adapter.service.Lightning;

/**
 * @author ksying
 * @date 2022/7/11 21:31
 */
public class LightningImpl implements Lightning {
    @Override
    public void charge() {
        System.out.println("使用 Lightning 充电头");
    }
}
