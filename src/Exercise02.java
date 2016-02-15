import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by vajrayogini on 2/15/16.
 */
public class Exercise02 {
    public static void main(String[] args) {
        ArrayList<Email> allEmails = new ArrayList<>();
        allEmails.add(new Email("alice@gmail.com", "Hi", "What's up"));
        allEmails.add(new Email("bob@gmail.com", "Hi", "What's up"));
        allEmails.add(new Email("charlie@gmail.com", "Hi", "What's up"));
        allEmails.add(new Email("alice@gmail.com", "Hi", "What's up"));
        allEmails.add(new Email("bob@gmail.com", "Hi", "What's up"));

        Collections.sort(allEmails); //collections is an interface, generic methods
        System.out.println(allEmails);

        HashMap<String, ArrayList<Email>> emailsByDest = new HashMap<>(); //can use get and check for null or use contains key
        for (Email email: allEmails) {
            if (!emailsByDest.containsKey(email.destination)) { //if not there, create arraylist with email.destination as key
                emailsByDest.put(email.destination, new ArrayList<>());
            }
            //populate arraylist
            emailsByDest.get(email.destination).add(email);

        }

        System.out.println();

    }


}
