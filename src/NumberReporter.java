/**
 * Created by afaren on 9/17/16.
 */
public class NumberReporter {
    public int report(int number) {
        return number;
    }
    public String reportSpecialNumber(int number){
        if (number % 3 == 0)
            return "fizz";
        return "";
    }

}
