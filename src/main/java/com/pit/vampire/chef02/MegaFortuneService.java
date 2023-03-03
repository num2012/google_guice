package com.pit.vampire.chef02;

import com.pit.vampire.chef01.FortuneService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MegaFortuneService implements FortuneService {
    private static final List<FortuneService> SERVICES=
            Arrays.<FortuneService>asList(new FunnyFortuneService(),
                    new QuoteFortuneService());

    @Override
    public String randomFortune() {
        int index = new Random().nextInt(SERVICES.size());
        return SERVICES.get(index).randomFortune();
    }
}
