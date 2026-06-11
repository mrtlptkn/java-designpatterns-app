package com.mrtlptkn.javadesignpatternsapp.behavioral.observer;

import java.math.BigDecimal;

public record StockMarketRequest(String name, BigDecimal newPrice) {
}
