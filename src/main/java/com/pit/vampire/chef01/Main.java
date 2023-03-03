package com.pit.vampire.chef01;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Google Guice 101");
        //Create Injector
        Injector injector= Guice.createInjector(new ChefModule());
        for(int i=0;i<10;i++){
            Chef chef= injector.getInstance(Chef.class);
            chef.makeFortuneCookie();
        }

    }
}
