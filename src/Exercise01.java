import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vajrayogini on 2/11/16.
 */

//HashMap within Array

public class Exercise01 {
    public static void main(String[] args) {
        String [] names = {"Alice", "Bob", "Charlie", "David", "Edward", "Albert", "Beth"}; //primitive array
        HashMap<Character, ArrayList<String>> nameMap = new HashMap<>();

        //create empty arrayLists
        for (String name : names) {
            char firstLetter = name.charAt(0);
            nameMap.put(firstLetter, new ArrayList<String>()); //pulls out first letter from name and leaves list empty
        }

        //add names
        for (String name : names) { //string name is a temporary/local variable
            char firstLetter = name.charAt(0);
            nameMap.get(firstLetter).add(name);
        }
        System.out.println(nameMap);
    }
}
