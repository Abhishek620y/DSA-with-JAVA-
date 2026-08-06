// public class Strbuilder {
//     public static void main (String args []) {
//         StringBuilder str = new StringBuilder("");

//         for (char ch='a'; ch<='z'; ch++) {
//             str.append(ch);
//         }

//         System.out.println(str);
//     }
// }

// convert first letter of word in sentence in upper letter

public class Strbuilder {
    public static String toGetupperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i=1; i<str.length(); i++) {
            if (str.charAt(i) == ' ' && i< str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main (String args []) {
        String str = "hi, i am abhishek";

        System.out.print(toGetupperCase(str));
    }
}
