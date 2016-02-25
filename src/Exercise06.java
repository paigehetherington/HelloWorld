import java.util.*;

/**
 * Created by vajrayogini on 2/25/16.
 */
public class Exercise06 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown"};

        //reverse the list
        //turn it into a hashmap
        //{"Smith": "Alice", "Hope": "Bob", "Brown": "Charlie"}

        //reverse the list
//        String[] reversedNames = new String[names.length]; //names.length, how long want it to be
//        reversedNames[names.length - i-1] = names[i];
// starts at end and goes to beginning
//        ArrayList<String> reversedNames = new ArrayList<>();
//        for (int i = names.length-1; i >= 0; i--) {
//        reversedNames.add(names[i]);
//
//    }
        //reverse the list

        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);

        //turn it into a HM

        HashMap<String, String> nameMap = new HashMap<>();
        for (int i = 0; i < reversedNames.size(); i+=2) {
            nameMap.put(reversedNames.get(i), reversedNames.get(i +1));


        }
    }









}
