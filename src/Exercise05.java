import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by vajrayogini on 2/24/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward", "alex" };
        // put the first five in new data structure
        ArrayList<String> newNames = new ArrayList<>(Arrays.asList(names));
        newNames = new ArrayList<>(newNames.subList(0,5));

        solveViaStream(newNames);
        solveViaTempLists(newNames);
        solveViaDirectModification(newNames);

        }
//        //make all the names uppercase
//        ArrayList<String> temp = new ArrayList<>();
//        for (String name : newNames)
//
//
//        temp.add(name.toUpperCase());
//
//
//        newNames = temp;
////        for (int i = 0; i < newNames.size(); i++) {
////        newNames.set(i, newNames.get(i).toUpperCase());


        //ArrayList<String> containing all the ones starting with "A"
    //make all uppercase
        static void solveViaDirectModification(ArrayList<String> names) {
            for (int i = 0; i < names.size(); i++) {
                names.set(i, names.get(i).toUpperCase());
            }
            System.out.println(names);
        }
    static void solveViaTempLists(ArrayList<String> names) {
        //make all upper case
        ArrayList<String> temp = new ArrayList<>();
        for (String name : names) {
            temp.add(name.toUpperCase());
        }
        names = temp;


        //filter out ones that don't start with "A"
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) { // if something next, grab it, safer way to modify collection while looping
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }

        temp = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                temp.add(name);
            }
        }
        names = temp;

        System.out.println(names);

    }

    static void solveViaStream(ArrayList<String> names) {
        names = names.stream() //map method made available by strem
                .map((name) -> { //anon fxn
                    return name.toUpperCase(); //return whatever we want done to it
                })
                .filter((name) -> { //what condition use to filter it
                   return name.startsWith("A");
                    //if only one line can do: .filter((name) -> name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new)); //convert stream to AL of string

        System.out.println(names);
    }




    }

//        System.out.println(names.subString (0,4));
//
//        ArrayList<String> firstFive = new ArrayList<>();
//        //names.get[0,4] = firstFive[];
//        firstFive = names.subString
//
//        String[] upperCase = names.toUpperCase();
//
//
//        String[] startsWithA = new String[];
//        if (names [0] = "A") {
//            startsWithA.add(name);
//        }




