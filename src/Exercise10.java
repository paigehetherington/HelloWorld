/**
 * Created by vajrayogini on 3/10/16.
 */
public class Exercise10 {
    public static void main(String[] args) throws Exception {
        String palindrome = "racecar";
        String nonPalindrome = "hello";
        if (isPalindrome(palindrome) && !isPalindrome(nonPalindrome)) {
            System.out.println("IT WORKS!");
        }
        else {
            throw new Exception("Fail");

        }
    }




    public static boolean isPalindrome(String s) {

        //return s.equals(new StringBuilder(s).reverse().toString());
        //split string into halves and run while loop checking characters at each end
        int i = 0;
        while (true) {
            if (i == s.length()/2) { //if reach middle of string get out, reached palindrome
                return true;
            }
            else if(s.charAt(i) == s.charAt(s.length()-i-1)) {
                i++;
            }
            else {
                return false;
            }

        }
    }

}

