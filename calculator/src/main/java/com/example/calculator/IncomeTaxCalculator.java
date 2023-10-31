package com.example.calculator;

public class IncomeTaxCalculator {

    public double calculateTax(double income) {
        // 根据个人所得金额计算个人所得税
        // 这里可以根据实际的个人所得税计算规则进行计算
        // 这里只是一个简单的示例
        if (income <= 5000) {
            return 0;
        } else if (income <= 10000) {
            return (income - 5000) * 0.1;
        } else {
            return (10000 - 5000) * 0.1 + (income - 10000) * 0.2;
        }
    }
}
