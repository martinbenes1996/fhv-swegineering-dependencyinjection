package fhv.se.di.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Calculator1 implements Calculator {
    @Override
    public int calculate(int num) {
        return num+1;
    }
}
