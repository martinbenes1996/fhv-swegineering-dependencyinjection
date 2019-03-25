
package app;

import java.util.Scanner;

public class Reader {

    public static double readFuzzyValueFromKeyboard() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Give me a value from <0;1>: ");
            double value;
            try { 
                value = in.nextDouble();
                if(value >= 0.0 && value <= 1.0) { return value; }
            } catch(Exception e) {}
        }
    }

}


