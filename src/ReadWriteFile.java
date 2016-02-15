import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by vajrayogini on 2/10/16.
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Alice\n"); //overwrites file
        fw.append("Bob\n"); //appends file
        fw.append("Charlie\n");
        fw.close();

        Scanner scanner = new Scanner(f); //pass file object to scanner. if didn't have do newFile(f)
        //read line by line
        while (scanner.hasNext()) { //hasNext: more available to read? at end...no. so goes line by line
            System.out.println(scanner.nextLine());//reads line-by-line and prints out
        }
        //read entire file
        scanner = new Scanner(f); //re-initialize so can read again from beginning cause read to end in above example
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        System.out.println(contents); //reads entire content at once and printed out
    }
}
