import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by vajrayogini on 3/1/16.
 */
public class Exercise07 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //read names into the arraylist, ex: "Martha Jenkins"
        Scanner scanner = new Scanner("people.csv");
        scanner.next();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] columns = line.split(",");
            String name = columns[1] +" " + columns[2];
            names.add(name);
        }
        String searchTerm = "ali";
        //new arraylist called "results"
        //results should be filled with the names matching searchTerm, case insensitive search
        ArrayList<String> results = new ArrayList<>();
        for (String name: names) {
            if (name.toLowerCase().contains(searchTerm)) {
                results.add(name);
            }
        }
        System.out.println(results);

        //use stream. pure operation on collection. see Ex 5
        results = names.stream()
                .filter((name) -> {
            return name.toLowerCase().contains(searchTerm);
        })
        .collect(Collectors.toCollection(ArrayList<String> ::new));

        System.out.println(results);

    //readFile(names);


    }
//    public static void readFile(ArrayList<Person> names) throws FileNotFoundException {
//        File f = new File("people.csv");
//        Scanner scanner = new Scanner(f);
//        scanner.nextLine(); //skips first line
//        while (scanner.hasNext()) {
//            String line = scanner.nextLine();
//            String[] columns = line.split(",");
//            Individual p = new Individual(columns[1], columns[2]);
//            names.add(p);
//        }
}
