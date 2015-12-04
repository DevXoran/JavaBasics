package Strings;

public class StringObjects {

    public static void main(String[] args) {
        
        String lang = "Java";
        
        // Wir bestimmen den Klassennamen auf den sich die lang Variable bezieht
        String bclass = lang.getClass().toString();
        System.out.println(bclass);
        
        String sup = lang.getClass().getSuperclass().toString();
        System.out.println(sup);
        
        if (lang.isEmpty()) {
            
            System.out.println("The string is empty");
        } else {
            
            System.out.println("The string is not empty");
        }
        
        int l = lang.length();
        System.out.println("The string has " + l + " characters");
    }
}
