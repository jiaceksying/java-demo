package com.example.demo.xiaomei.pattern.template;

/**
 * @author ksying
 * @date 2022/6/29 07:21
 */
public class Test {
    public static void main(String[] args) {
        // 抽象方法模式
        Calculator c1 = new Calculator1();
        Calculator c2 = new Calculator2();
        Calculator c3 = new Calculator3();
        c1.calculate();
        c2.calculate();
        c3.calculate();
    }

    public static class Calculator1 extends AbstractCalculator {

        @Override
        protected void specialCalculate() {
            System.out.println("c1 特殊计算");
        }
    }

    public static class Calculator2 extends AbstractCalculator {

        @Override
        protected void specialCalculate() {
            System.out.println("c2 特殊计算");
        }
    }

    public static class Calculator3 extends AbstractCalculator {

        @Override
        protected void specialCalculate() {
            System.out.println("c3 特殊计算");
        }
    }
}
