package com.pit.vampire.chef02;

import com.google.inject.Inject;
import com.pit.vampire.chef01.FortuneCookie;
import com.pit.vampire.chef01.FortuneService;

public class Chef {
    private FortuneService fortuneService;

    @Inject
    public Chef(@Mega FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void makeFortuneCookie(){
        System.out.println(new FortuneCookie(fortuneService.randomFortune()));

    }
}
