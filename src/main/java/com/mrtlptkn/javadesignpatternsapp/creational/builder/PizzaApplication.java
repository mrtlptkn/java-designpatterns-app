package com.mrtlptkn.javadesignpatternsapp.creational.builder;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

// Builder tasarım deseni ile hiçbir alakası yoksa
// buarad ama requesten gelen talebe göre dorğu nesneye oluşturmayı yönetmek
// Genelde bu tarz sınıflar için ya Manager suffix yada Application, Client suffix kullanırız.
// Controllerdan çağırılacak olan Manager Service, Application Service bu
@Service
@Scope("prototype") // Her çağrıldığında yeni bir instance oluşturulur, isteğe özel nesne yönetimi için
public class PizzaApplication {


    Pizza create(PizzaRequest request){

        PizzaBuilder builder = new PizzaBuilderImp(request.size());

        if(request.extraCheeses())
            builder.withExtraCheeses();

        if(request.extraMushrooms())
            builder.withExtraMushrooms();

        if(request.extraOlives())
            builder.withExtraOlives();

        return builder.build();

    }



}
