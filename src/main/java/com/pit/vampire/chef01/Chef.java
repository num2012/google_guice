package com.pit.vampire.chef01;

import com.google.inject.Inject;

public class Chef {
    private FortuneService fortuneService;

    @Inject
    public Chef(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void makeFortuneCookie(){
        System.out.println(new FortuneCookie(fortuneService.randomFortune()));

    }
}
