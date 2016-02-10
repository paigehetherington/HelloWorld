import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by vajrayogini on 2/10/16.
 */
public class ReadWriteJson {
    public static void main(String[] args) throws IOException {
        Person p = new Person("Alice Smith", 25, true); //writing the file first in jason
        File f = new File("person.json");//file extension is json

        //write json
        JsonSerializer serializer = new JsonSerializer(); //create serializer object
        String json = serializer.serialize(p); //calling its method on it
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        //read json
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z"); //keep reading until end
        String contents = s.next(); //reading all of it into a string. contents and json should be equal (what we write and what we read)
        JsonParser parser = new JsonParser(); //creating new object to save it in
        Person p2 = parser.parse(contents, Person.class);

        System.out.println(p2);
    }
}
