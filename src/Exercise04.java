import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by vajrayogini on 2/22/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        // to be or not that is the question - create string with duplicates removed
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(",", "").replace(".", "");
        String[] words = sentence.split(" ");
        System.out.println(words);
        LinkedHashMap<String, Integer> frequencies = new LinkedHashMap<>();
        for (String word : words) {
            Integer count = frequencies.get(word);
            if (count == null) {
                frequencies.put(word, 1);
            } //else {
               //frequencies.remove(word, 1);
            //}

        }
        String newSentence = " ";
        newSentence = String.valueOf(frequencies.keySet());

        System.out.println(newSentence);
    }
}

