package datatypes2;

public class Boxing {

    public static void main(String[] args) {
        
        long a = 123235L;
        
        Long b = new Long(a);
        Long c = b.longValue();
        
        System.out.println(c);
    }
}
