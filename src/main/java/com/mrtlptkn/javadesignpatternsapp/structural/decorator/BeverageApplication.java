package com.mrtlptkn.javadesignpatternsapp.structural.decorator;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;


// Not: Structural Design Pattern (Yapısal Tasarım Desenleri), mevcut kodun yapısını mümkün olduğunca değiştirmeden sınıflara yeni davranışlar eklemeyi, farklı türdeki sınıfların birlikte çalışmasını sağlamayı ve dış sistemleri kendi uygulamamıza uyarlamayı amaçlayan tasarım desenleridir. Bu desenler, nesneler ve sınıflar arasındaki ilişkileri düzenleyerek sistemin daha esnek, genişletilebilir ve yönetilebilir olmasını sağlar.


@Component
public class BeverageApplication {


    public void  submitBeverage() {

        Coffee coffee = new Coffee();
        coffee.setCost(BigDecimal.valueOf(200.0));

        System.out.println(coffee.getDescription() + " - Cost: " + coffee.getCost());
        CreamDecorator creamDecorator = new CreamDecorator(coffee);
        System.out.println(creamDecorator.getDescription() + " - Cost: " + creamDecorator.getCost());

        // wrapper creamDecorator olduğunda
        // Milk wraps Cream wraps Coffee
        Beverage coffeeWithMilkAndCream = new MilkDecorator(creamDecorator);
        System.out.println(coffeeWithMilkAndCream.getDescription() + " - Cost: " + coffeeWithMilkAndCream.getCost());


        Tea tea = new Tea(); // 10 liradan aşağı satılamaz
        tea.setCost(BigDecimal.valueOf(50.0));
        System.out.println(tea.getDescription() + " - Cost: " + tea.getCost());

        Beverage teaWithMilk = new MilkDecorator(tea);
        System.out.println(teaWithMilk.getDescription() + " - Cost: " + teaWithMilk.getCost());


    }



}
