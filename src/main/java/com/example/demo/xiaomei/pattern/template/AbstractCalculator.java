package com.example.demo.xiaomei.pattern.template;

/**
 * @author ksying
 * @date 2022/6/29 07:16
 */
public abstract class AbstractCalculator implements Calculator{
    @Override
    public void calculate() {
        commonCalculate();
        specialCalculate();
    }

    private void commonCalculate(){
        System.out.println("通用计算");
    }

    protected abstract void specialCalculate();
}
