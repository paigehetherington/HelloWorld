import java.util.HashMap;

/**
 * Created by vajrayogini on 2/15/16.
 */
public class Exercise03 {//breaking down by word frequency
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        //first sanitize sentence and get rid of punctuation and normalize capitalization
        sentence = sentence.toLowerCase(); //strings immutable/can't modify directly so must redefine it
        sentence = sentence.replace(",", "").replace(".", ""); //chain replace methods to get rid of , and .
        String [] words = sentence.split(" "); //split returns string array
        System.out.println(words);
        HashMap<String, Integer> frequencies = new HashMap<>(); //need boxed version of int -that's all HM can hold
        for (String word : words) {
            Integer count = frequencies.get(word);
            if (count == null) { //if count of word is empty, add to hm
                frequencies.put(word, 1);
            }
            else {
                frequencies.put(word, count +1); //otherwise add additional(+1) to HM
            }
        }
        System.out.println(frequencies);

    }
}
