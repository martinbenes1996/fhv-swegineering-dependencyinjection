
package app_spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import ifce.NegatorIfce;
import app.Reader;

@SpringBootApplication
public class FuzzyCalculator_Spring {

    @Autowired
    private static NegatorIfce negator;

    public static void main(String[] args) {

        double value = Reader.readFuzzyValueFromKeyboard();
        double nvalue = negator.negate(value);

        System.out.printf("Negated value is %.3f.\n", nvalue);
    }
}
