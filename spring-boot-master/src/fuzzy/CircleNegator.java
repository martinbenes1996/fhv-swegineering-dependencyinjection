
package fuzzy;

import java.lang.Math;
import ifce.NegatorIfce;


public class CircleNegator implements NegatorIfce {

    @Override
    public double negate(double x) {
        return Math.sqrt(1 - x*x);
    }
}
