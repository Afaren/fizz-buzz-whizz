/**
 * Created by afaren on 9/17/16.
 */
public class NumberReporter {


    private int first;
    private int second;
    private int third;

    public NumberReporter(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Object report(int number) {
        String result = "";
        if (number % first == 0)
            result += "Fizz";

        if (number % second == 0)
            result += "Buzz";

        if (number % third == 0)
            result += "Whizz";

        if (contains3(number)) {
            return "Fizz";
        }
        return result.length() == 0 ? new Integer(number) : result;
    }

    private boolean contains3(int number) {
        return (number + "").contains("3");
    }
}
