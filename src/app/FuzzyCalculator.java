
package app;

import ifce.NegatorIfce;

import app.Reader;

public class FuzzyCalculator {
    private static NegatorIfce negator;
    public static void setNegator(NegatorIfce neg) { negator = neg; }

    public static void main(String[] args) {

        double value = Reader.readFuzzyValueFromKeyboard();
        double nvalue = negator.negate(value);

        System.out.printf("Negated value is %.3f.\n", nvalue);
    }
}