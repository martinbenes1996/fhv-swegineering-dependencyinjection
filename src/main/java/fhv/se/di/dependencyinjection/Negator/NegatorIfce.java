package fhv.se.di.dependencyinjection.Negator;

public interface NegatorIfce {

    /**
     * @brief Performs fuzzy negation.
     * @param x         Input fuzzy value.
     * @returns Negated x value.
     */
    public double negate(double x);
}

