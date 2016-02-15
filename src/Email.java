/**
 * Created by vajrayogini on 2/15/16.
 */
public class Email implements Comparable { //interfaces from libraries. contract: if you agree to this, your code will owrk with mine
    String destination;
    String subject;
    String body;


    public Email(String destination, String subject, String body) {
        this.destination = destination;
        this.subject = subject;
        this.body = body;
    }

    @Override //automatically makes use of built in methods
    public int compareTo(Object o) {
        Email e = (Email) o; //from no on treat as email object. have access to three fields in email class
        return destination.compareTo(e.destination); //compare two destinations
    }

    @Override //generate toString
    public String toString() {
        return "Email{" +
                "destination='" + destination + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
