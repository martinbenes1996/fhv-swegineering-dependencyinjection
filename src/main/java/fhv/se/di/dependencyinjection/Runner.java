package fhv.se.di.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Runner {
    @Autowired List<Calculator> calcs;

    @PostConstruct
    public void run(){
        System.out.println("Runs!");
        calcs.forEach(calc -> {
            System.out.println(calc.calculate(5));
        });
    }

}
