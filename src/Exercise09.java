/**
 * Created by vajrayogini on 3/8/16.
 */
public class Exercise09 {
    public static void main(String[] args) {
        int num = 12345;

        useLoop(num);
        useReverse(num);
        reverseNumber(num);
        // ...
        // int newNum = 542321

        String numStr = String.valueOf(num);
        StringBuffer buff = new StringBuffer(numStr);
        numStr = buff.reverse().toString();

        /*String newNumStr = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            String charStr = String.valueOf(numStr.charAt(i));
            newNumStr += charStr;
        } */

        int newNum = Integer.valueOf(numStr);
        System.out.println(newNum);
    }

    public static void useLoop(int num) {
        String numStr = String.valueOf(num);
        String newNumStr = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            newNumStr += numStr.charAt(i);
        }
        int newNum = Integer.valueOf(newNumStr);
        System.out.println(newNum);

    }

    public static void useReverse(int num) {
        String numStr = String.valueOf(num);
        //string builder faster that stringBuffer but is single threaded
        numStr = new StringBuilder(numStr).reverse().toString();
        int newNum = Integer.valueOf(numStr);
        System.out.println(newNum);
    }
    public static int reverseNumber(int number){

        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
//        int newNum = reverseNumber(num);
    }

//    public static void useMath(int num) {
//        int result = 0;
//        int rem;
//        while (num > 0) {
//            rem = num % 10;
//            num = num / 10;
//            newNum = newNum * 10 + rem;
//        }
//        System.out.println(newNum);
//
//    }


           //         NumberReverse nr = new NumberReverse();
            //        System.out.println("Result: "+nr.reverseNumber(17868));

    }

