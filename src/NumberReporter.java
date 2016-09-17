/**
 * Created by afaren on 9/17/16.
 */
public class NumberReporter {


    public Object report(int number) {
        String result = "";
        if (number % 3 == 0)
            result += "Fizz";

        if (number % 5 == 0)
            result += "Buzz";

        if (number % 7 == 0)
            result += "Whizz";

        return result.length() == 0 ? new Integer(number) : result;
    }
}
