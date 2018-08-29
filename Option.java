package scheduled;

import java.lang.*;
import java.util.*;

// ok get it to the user

final public class Option extends Position {

    private char right;
    private Date expDate;
    private double strike;
    
    Option(String posinfo) 
    {
        Scanner s = new Scanner(posinfo);
        symbol = s.next();
        // exp_date = s. 
        strike = s.nextDouble();
        // right  = s.nextByte();
        position = s.nextInt();
        cost = s.nextDouble();        
       
    }
    
    @Override
    String getDescription() {
        return symbol + " " + expDate.toString() + " "
            + Double.toString(strike) + " " + right + " "
            + Integer.toString(position) + " " + Double.toString(cost);
    }
    
}
