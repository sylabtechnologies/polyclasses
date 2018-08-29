package scheduled;

import java.lang.*;
import java.util.*;

abstract class Position {
    
    static private final String NoName = "Error";
    
    // make derived classes closed for extenstion
    protected String symbol;
    protected int position;
    protected double cost;


    // close for extension
    final public int getSize() { return position; }
    final public double getCost() { return cost; }
    
    // implement by sublasses
    abstract String getDescription();

}
