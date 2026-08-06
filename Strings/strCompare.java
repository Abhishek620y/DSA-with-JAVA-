public class strCompare {
    public static void main (String args []) {
        String s1 = "Abhishek";
        String s2 = "Abhishek";
        String s3 = new String ("Abhishek");

        if (s1 == s2) {
            System.out.println("string are equal"); 
        } else {
            System.out.println("string are not equal ");
        }
        
        // here both are not equal because s3 is create with a new string 
        
        if (s1 == s3) {
            System.out.println("string are equal"); 
        } else {
            System.out.println("string are not equal ");
        }
        
        // here both are equal because its check actual value of string 
        if (s1.equals(s2)) {
        System.out.println("string are equal"); 
    } else {
        System.out.println("string are not equal ");
    }
    
    }
}
