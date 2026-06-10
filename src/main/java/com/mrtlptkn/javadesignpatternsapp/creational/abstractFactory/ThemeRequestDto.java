package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

import lombok.Data;


// Record Init only çalışır
// Immutable çalışır (init only olduğundan, set edilemez. getter gibi çalışır)
// Event Driven Programlamada (Event) olarak ve Web Programlamada (Reqeust,DTO) olarak ve DDD ise ValueObject olarak kullanılır new Money(100,"$"); new Money(100,"TL");
// ValueObject -> en az 2 parçadan oluşan ve değer olarak birbirinden farklı olan yapılar
// Classdan farklı olarak, recordlarda equals ve hashcode otomatik olarak fieldlara göre oluşturulur. Classlarda ise referansa göre oluşturulur. Bu nedenle recordlar value-based equality sağlar, classlar ise reference-based equality sağlar.
// Ram üzerinde classlara göre daha lightweight çalışır
public record ThemeRequestDto(String themeType) {
}
