package com.pit.vampire.chef01;

import java.util.Objects;

public class FortuneCookie {

    private final String fortuneMessage;
    public FortuneCookie(String fortuneMessage){
        this.fortuneMessage=fortuneMessage;
    }

    @Override
    public String toString() {
        return "FortuneCookie{" +
                "fortuneMessage='" + fortuneMessage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FortuneCookie that = (FortuneCookie) o;
        return Objects.equals(fortuneMessage, that.fortuneMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fortuneMessage);
    }
}
