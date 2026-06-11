package com.mrtlptkn.javadesignpatternsapp.behavioral.chain;

import java.math.BigDecimal;

// sepetteki ürünleri girip siparişe çevirecek. Bu sebeple müşteri No ve Sepete Code yeterlidir.
// isFraud,isStockAvailable,isPaymentVerified aslında basketCode göre sepetteki ürünlere ve müşteri numarasına göre servisten bulunacak şeyler ama uğraşmamak için buraya dinamik olarak değer gönderdik.
public record OrderRequest(String basketCode,String customerNumber, Boolean isFraud, Boolean isStockAvailable, Boolean isPaymentVerified) {
}
