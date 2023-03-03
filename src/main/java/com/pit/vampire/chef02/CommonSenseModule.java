package com.pit.vampire.chef02;

import com.google.inject.AbstractModule;
import com.pit.vampire.chef01.FortuneService;
import com.pit.vampire.chef01.FortuneServiceImpl;

public class CommonSenseModule extends AbstractModule {
    public CommonSenseModule(){
        System.out.println("CommonSense Module is in play now");
    }
    protected void configure(){
        bind(FortuneService.class).to(FortuneServiceImpl.class);
        bind(FortuneService.class).annotatedWith(Mega.class).to(MegaFortuneService.class);
    }
}
