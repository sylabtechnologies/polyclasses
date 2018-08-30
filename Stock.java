package scheduled;

import java.lang.*;
import java.util.*;

final public class Stock extends Position {
    
    Stock (String posinfo) {
        Scanner s = new Scanner(posinfo);
        symbol = s.next();
        position = s.nextInt();
        cost = s.nextDouble();
    }
    
    @Override
    public String getDescription() {
        return symbol + " " + Integer.toString(position) + " "
            + Double.toString(cost);
    }
    
}
