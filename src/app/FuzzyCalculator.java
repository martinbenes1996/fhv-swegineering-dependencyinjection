
package app;

import ifce.NegatorIfce;
import fuzzy.*;

import app.Reader;

public class FuzzyCalculator {
    private static NegatorIfce negator;

    public static void main(String[] args) {
        negator = new StandardNegator();

        double value = Reader.readFuzzyValueFromKeyboard();
        double nvalue = negator.negate(value);

        System.out.printf("Negated value is %.3f.\n", nvalue);
    }
}