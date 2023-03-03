package com.pit.vampire.chef02;

import com.pit.vampire.chef01.FortuneService;

import java.awt.font.FontRenderContext;

public class FunnyFortuneService implements FortuneService {
    @Override
    public String randomFortune() {
        return "FunnyFortuneService fortune";
    }
}
