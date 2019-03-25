
package app;

import app.FuzzyCalculator;
import fuzzy.*;

class FuzzyCalculator_Glue {
    public static void main(String[] args) {
        FuzzyCalculator.setNegator( new StandardNegator() );
        FuzzyCalculator.main( null );
    }
}