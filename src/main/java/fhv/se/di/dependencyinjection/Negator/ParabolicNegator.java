package fhv.se.di.dependencyinjection.Negator;

import org.springframework.stereotype.Component;

@Component
public class ParabolicNegator implements NegatorIfce {

    @Override
    public double negate(double x) {
        return (1 - x*x);
    }
}
