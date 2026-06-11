package com.mrtlptkn.javadesignpatternsapp.behavioral.strategy;

public class SmallEnterprises implements CommissionStrategy {
    @Override
    public java.math.BigDecimal apply(java.math.BigDecimal amount, String currency) {
        System.out.println("Applying commission for small enterprises in " + amount + " " + currency);
        return amount.multiply(java.math.BigDecimal.valueOf(0.02)); // 2% commission for small enterprises
    }
}
