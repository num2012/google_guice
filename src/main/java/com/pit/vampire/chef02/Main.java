package com.pit.vampire.chef02;

import com.google.inject.*;
import com.google.inject.Module;
import com.pit.vampire.chef01.FortuneService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Playing with Binding annotations");
        Injector injector = Guice.createInjector(new CommonSenseModule());
        FortuneService fortuneService = injector.getInstance(FortuneService.class);
        System.out.println(fortuneService.randomFortune());
        for (int i = 0; i < 10; i++) {
            FortuneService fortuneService1 = injector.getInstance(Key.get(FortuneService.class, Mega.class));
            System.out.println(fortuneService1.randomFortune());

        }

        //        Chef chef=injector.getInstance(Chef.class);
//        chef.makeFortuneCookie();
    }
}
