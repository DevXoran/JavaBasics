package Strings;

public class MutableImmutable {

    public static void main(String[] args) {
        
        String name = "Jane";
        String name2 = name.replace('J', 'K');
        String name3 = name2.replace('n', 't');
        //The original string is not modified
        System.out.println(name);
        System.out.println(name3);
        
        StringBuilder sb = new StringBuilder("Jane");
        System.out.println(sb);
        
        //like an array
        //The original string is modified
        sb.setCharAt(0, 'K');
        sb.setCharAt(2, 't');
        
        System.out.println(sb);
        
    }
}
