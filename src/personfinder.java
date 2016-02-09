import java.util.ArrayList;

/**
 * Created by vajrayogini on 2/9/16.
 */
public class personfinder {
    public static void main(String[] args) {
        ArrayList<Person>people = new ArrayList<>();
        people.add(new Person("Alice Smith", 30, true));
        people.add(new Person("Bob Smith", 35, true));
        people.add(new Person("Charlie Smith", 40, true));

        ArrayList<Person>peopleUnder40 = new ArrayList<>(); //how to find something in an arrayList, filtering operation
        for (Person p : people) { //always involves looping over it
            if (p.getAge() < 40){ //condition
                peopleUnder40.add(p); //if true, add to subset
            }
        }
        System.out.println(peopleUnder40);

        Person firstMatch = null; //not creating a new person, just finding first one and associating with firstMatch variable
        for (Person p: people) {
            if (!p.getName().startsWith("A")) {
                firstMatch = p; //setting entire variable = p
                break;
            }
        }
        System.out.println(firstMatch);
    }
}
