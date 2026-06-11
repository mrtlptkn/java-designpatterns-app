package com.mrtlptkn.javadesignpatternsapp.behavioral.strategy;

import java.math.BigDecimal;

public class MediumEnterprises implements CommissionStrategy {
    @Override
    public BigDecimal apply(BigDecimal amount, String currency) {
        System.out.println("Applying commission for medium enterprises in " + amount + " "  + currency);
        return amount.multiply(BigDecimal.valueOf(0.07)); // 7% commission for medium enterprises
    }
}
