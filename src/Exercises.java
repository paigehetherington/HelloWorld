import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vajrayogini on 5/3/16.
 */
public class Exercises {
    public static void main(String[] args) {

        //PROBLEM 1
        String [] names = {"Alice", "Bob", "Charlie", "David", "Albert", "Daniel"};
        //HM organizes the names by their first letter
        // {"A": [Alice, Albert], "B"; [Bob], ...}
        HashMap<String, ArrayList<String>> nameMap;

        //solution 1
        nameMap = new HashMap<>();
        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            nameMap.put(firstLetter, new ArrayList<>());
        }
        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            nameMap.get(firstLetter).add(name);
        }
        System.out.println(nameMap);

        //solution 2
        nameMap = new HashMap<>();
        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> arr = nameMap.get(firstLetter);
            if (arr == null) {
                arr = new ArrayList<>();
                arr.add(name);
                nameMap.put(firstLetter, arr);
            }
            else {
                arr.add(name);
            }
            System.out.println(nameMap);
        }

        //PROBLEM 2

        //frequencies

        String sentence = "To be or not to be that is the question";
        //HM {"to": 2 "be": 2, "or": 1, ...}
        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");
        //System.out.println(words);
        HashMap<String, Integer> frequencies = new HashMap<>();

        // solution 1
        frequencies = new HashMap<>();
        for (String word : words) {
           frequencies.put(word, 0);
        }
        for (String word : words) {
            int count = frequencies.get(word);
            count++;
            frequencies.put(word, count);
        }
        System.out.println(frequencies);

        //solution 2

        frequencies = new HashMap<>();
        for (String word : words) {
            Integer count = frequencies.get(word); //must be boxed cause initially will be null and can't do with primitive
            if (count == null) {
                frequencies.put(word, 1);
            }
            else {
                count++;
                frequencies.put(word, count);
            }
        }
        System.out.println(frequencies);

       // PROBLEM 3

        String palindrome  = "racecar";
        boolean isPalindrome = true;

        //solution 1
        for (int i = 0; i <= palindrome.length()/2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);

        //solution 2
        StringBuffer buffer = new StringBuffer(palindrome);
        String reverse = buffer.reverse().toString();
        isPalindrome = palindrome.equals(reverse);
        System.out.println(isPalindrome);
    }
}
