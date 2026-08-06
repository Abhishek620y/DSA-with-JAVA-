// To print the largest of the string by lexicographic method 
// in this method we compare the letter of word means which letter comes first 

// syntax ----  str1.compareTo(str2)
//      if output =0  thr str1== sr2
//                 <0  then str1 < str2
//                 >0  then str1 > str2


public class largestStr {
    public static void main (String args []) {
        String fruits [] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for (int i=0; i<fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}



 
