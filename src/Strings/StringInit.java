package Strings;

public class StringInit {

    public static void main(String[] args) {
        
        char[] cdb = {'M', 'y', 'S', 'q', 'l'};
        
        String lang = "Java";
        String ide = new String("NetBeans");
        String db = new String(cdb);
        
        System.out.println(lang);
        System.out.println(ide);
        System.out.println(cdb);
        
        StringBuilder sb1 = new StringBuilder(lang);
        
        //We create an empty StringBuilder object.
        //We append three strings into the object.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fields");
        sb2.append(" of ");
        sb2.append("glory");
        
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
