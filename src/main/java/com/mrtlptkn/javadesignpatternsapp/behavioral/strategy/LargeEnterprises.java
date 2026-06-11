package com.mrtlptkn.javadesignpatternsapp.behavioral.strategy;

import java.math.BigDecimal;

public class LargeEnterprises implements CommissionStrategy {
    @Override
    public BigDecimal apply(BigDecimal amount, String currency) {
        System.out.println("Applying commission for large enterprises in " + amount + " "+ currency);
        return amount.multiply(BigDecimal.valueOf(0.15)); // 15% commission for large enterprises
    }
}
