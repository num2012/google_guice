package com.pit.vampire.chef02;

import com.pit.vampire.chef01.FortuneService;

public class QuoteFortuneService implements FortuneService {
    @Override
    public String randomFortune() {
        return "QuoteFortuneService fortune";
    }
}
