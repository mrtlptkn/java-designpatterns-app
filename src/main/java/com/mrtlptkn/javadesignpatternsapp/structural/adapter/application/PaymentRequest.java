package com.mrtlptkn.javadesignpatternsapp.structural.adapter.application;

import java.math.BigDecimal;

public record PaymentRequest(BigDecimal amount,String currency) {
}
