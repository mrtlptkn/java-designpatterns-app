package com.mrtlptkn.javadesignpatternsapp.behavioral.strategy;

import java.math.BigDecimal;

// Strategy bazlı kullanılan sınıfı runtimeda belirleyen bir yöntem
// SRP hemde DIP uygundur.

public interface CommissionStrategy {

    BigDecimal apply(BigDecimal amount, String currency);

}
