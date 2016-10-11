import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import javax.sound.midi.Soundbank;

/**
 * Created by vajrayogini on 10/11/16.
 */
public class Exercise11 {


int num = 12345;
//manually reverse a string
    String numStr = String.valueOf(num);
    String numStr2 = "";
    for (int i = numStr.length()-1; i >= 0; i--) {
        numStr2 += numStr.charAt(i);

    }
    int num2 = Integer.valueOf(numStr2);
    System.out.println(num2);


    //String Builder reverse
    //returns itself so create a new string builder object

    StringBuilder sb = new StringBuilder(String.valueOf(num));
    sb.reverse();
    num2 = Integer.valueOf(sb.toString());
    System.out.println(num2);

    //use math...

    num2 = 0;
    while (num != 0)

    {
        num2 *= 10;
        num2 += num % 10;
        num /= 10;


    }
System.out.println(num2);

}
