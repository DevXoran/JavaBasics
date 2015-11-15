package datatypes2;

import java.util.ArrayList;

/*Collections (After we box the primitive values,
we can put them into collections.)*/
public class Numbers {

    public static void main(String[] args) {
        
        /*The Number is an abstract base class for
        all five numeric primitive types in Java.*/
        ArrayList<Number> ls = new ArrayList<>();
        
        //we add five Wrapper classes to the Container
        ls.add(new Integer(1342341));
        ls.add(new Float(34.56));
        ls.add(new Double(235.242));
        ls.add(new Byte("102"));
        ls.add(new Short("1245"));
        
        for (Number n : ls) {
            
            System.out.println(n.getClass());
            System.out.println(n);
        }
    }
}
