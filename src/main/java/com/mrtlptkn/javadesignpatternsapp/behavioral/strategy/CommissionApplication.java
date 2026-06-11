package com.mrtlptkn.javadesignpatternsapp.behavioral.strategy;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

// Strategy tasarım deseni ile bir alakası yok sadece gelen parametreye göre doğru strategy buldurmamız gerekiyor. O yüzden bu class'ı service yaparak gelen parametreye göre strategy bulduracağız.
// Hangi tipte bir şirketle hangi tipi bir komisyon hesabı var bunu yönelndirmek (Router görevi görmek)
@Service
public class CommissionApplication {

    private final Map<String,CommissionStrategy> strategyMap = new HashMap<>();

    public CommissionApplication(){
        strategyMap.put(EnterprisesConsts.LARGE_ENTERPRISE, new LargeEnterprises());
        strategyMap.put(EnterprisesConsts.MEDIUM_ENTERPRISE, new MediumEnterprises());
        strategyMap.put(EnterprisesConsts.SMALL_ENTERPRISE, new SmallEnterprises());
    }


    public CommissionStrategy getStrategy(String enterpriseType){

        if(strategyMap.containsKey(enterpriseType)){
            return strategyMap.get(enterpriseType);
        } else {
            throw new IllegalStateException("Invalid enterprise type: " + enterpriseType);
        }

    }

    public void handle(CommissionRequest request){
        // strateji var mı ?
       CommissionStrategy strategy =  getStrategy(request.enterprise());
       // varsa strategy uygular.
       BigDecimal value =  strategy.apply(request.amount(), request.currency());
       System.out.println("Final amount after commission: " + value + " " + request.currency());
    }

}
