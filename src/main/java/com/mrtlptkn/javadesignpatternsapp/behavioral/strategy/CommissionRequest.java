package com.mrtlptkn.javadesignpatternsapp.behavioral.strategy;

import java.math.BigDecimal;

public record CommissionRequest(String enterprise, BigDecimal amount, String currency) {
}
