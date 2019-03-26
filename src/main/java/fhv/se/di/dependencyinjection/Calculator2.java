package fhv.se.di.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Calculator2 implements Calculator {
    @Override
    public int calculate(int num) {
        return num*2;
    }
}
