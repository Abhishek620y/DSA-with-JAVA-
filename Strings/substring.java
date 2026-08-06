public class substring {
    // this is the function to print substring 
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main (String args []) {
        String str = "Helloword";
        
        // this is the inbuild function to print substring 
        System.out.println(str.substring(0, 5));


        //System.out.print(substring(str, 0, 5));
    }
    
}
