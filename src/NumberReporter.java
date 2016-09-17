/**
 * Created by afaren on 9/17/16.
 */
public class NumberReporter {



    public Object report(int number) {
        if(number  % 5 == 0 )
            return "buzz";
        if (number % 3 == 0)
            return "fizz";
        if (number % 7 == 0)
            return "whizz";

        return new Integer(number);
    }
}
