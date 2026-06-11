package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

import java.util.Objects;

public class YellowTrafficState implements ITrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {

        // böyle kontrol etmek classlar ile çalışırken referans sorunların ayol açabilir. tehlikeli.
//        if(Objects.equals(trafficLight.getState(), new YellowTrafficState())){
//
//        }


        // Eğer bir önceki state kırmızı ise o zaman yeşile geç değilse kırmızıya geç
        // Akış bozulamasın diye State kontrolü yapıyoruz.
        if(trafficLight.getState().getColor().equals("Red")){
            trafficLight.setState(new YellowTrafficState());
            System.out.println("[Kırmızı] → Sarı geçiliyor");
        } else if(trafficLight.getState().getColor().equals("Green")){
            trafficLight.setState(new YellowTrafficState());
            System.out.println("[Yeşil] → Sarıya geçiliyor");
        }

    }

    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public String getDescription() {
        return "Hazırda Bekle!";
    }
}
