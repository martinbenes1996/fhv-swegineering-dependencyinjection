package fhv.se.di.dependencyinjection.Negator;

import org.springframework.stereotype.Component;

import java.lang.Math;

@Component
public class CircleNegator implements NegatorIfce {

    @Override
    public double negate(double x) {
        return Math.sqrt(1 - x*x);
    }
}
