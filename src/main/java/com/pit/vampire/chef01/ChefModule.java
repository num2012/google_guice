package com.pit.vampire.chef01;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Module;

public class ChefModule implements Module {
    public ChefModule(){
        System.out.println("Constructor of ChefModule called");
    }
    @Override
    public void configure(Binder binder) {
        binder.bind(FortuneService.class).to(FortuneServiceImpl.class);
    }
}
