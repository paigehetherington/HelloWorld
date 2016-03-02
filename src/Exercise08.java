import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by vajrayogini on 3/2/16.
 */
public class Exercise08 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob"};
        ArrayList<String> sortedNames = new ArrayList<>(); //must have dynamic collection
        //loop over names and have some way to sort and insert. add method takes 2 arguments (index, what inserting)

        // ...sort names alphabetically

        for (String name: names) {
            int index = 0;
            for (String sortedName: sortedNames) { //if name > sortedname increment index
                if (name.compareTo(sortedName) > 0) {
                    index++;
                }
                else {
                    break;
                }

            }
            sortedNames.add(index, name);
        }




        System.out.println(sortedNames);

    }



}
