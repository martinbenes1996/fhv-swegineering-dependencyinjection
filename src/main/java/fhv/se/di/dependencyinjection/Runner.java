package fhv.se.di.dependencyinjection;

import fhv.se.di.dependencyinjection.Negator.NegatorIfce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sound.midi.Soundbank;
import java.util.List;

@Component
public class Runner {
    @Autowired List<Calculator> calcs;
    @Autowired List<NegatorIfce> negators;

    @PostConstruct
    public void run(){
        System.out.println("Runs!");
        calcs.forEach(calc -> {
            System.out.println(calc.calculate(5));
        });

        System.out.println("Negators");
        negators.forEach(negator -> {
            System.out.println(negator.negate(0.4));
        });
    }

}
