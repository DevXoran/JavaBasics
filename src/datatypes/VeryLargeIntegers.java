package datatypes;

import java.math.BigInteger;

public class VeryLargeIntegers {

    public static void main(String[] args) {
        
        System.out.println(Long.MAX_VALUE);
        
        BigInteger b = new BigInteger("92233720368547758071");
        BigInteger c = new BigInteger("52498235605326345645");
        
        BigInteger a = b.multiply(c);
        //Note: BigInteger numbers are immutable (final warscheinlich)
        
        System.out.println(a);
    }
}
