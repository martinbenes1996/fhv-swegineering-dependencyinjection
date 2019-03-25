
package fuzzy;

import ifce.NegatorIfce;

public class StandardNegator implements NegatorIfce {

    @Override
    public double negate(double x) {
        return 1 - x;
    }
}

