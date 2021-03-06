/**
 * Created by afaren on 9/17/16.
 */

import java.util.Map;
import java.util.HashMap;

public class NumberReporter {


    private int first;
    private int second;
    private int third;
    private Map<Integer, String> pairs = new HashMap();

    public NumberReporter(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;

        pairs.put(first, "Fizz");
        pairs.put(second, "Buzz");
        pairs.put(third, "Whizz");
    }

    public Object report(int number) {

        if (containsFirst(number)) {
            return pairs.get(first);
        }

        return canBeMod(number) ? modNumberToTag(number) : new Integer(number);
    }

    private boolean canBeMod(int n) {
        return canBeModBy(first, n) || canBeModBy(second, n) || canBeModBy(third, n);
    }

    private boolean canBeModBy(int moder, int number) {
        return number % moder == 0;
    }

    private String modNumberToTag(int number) {
        String result = "";
        if (canBeModBy(first, number))
            result += pairs.get(first);

        if (canBeModBy(second, number))
            result += pairs.get(second);

        if (canBeModBy(third, number))
            result += pairs.get(third);
        return result;
    }


    private boolean containsFirst(int number) {
        return (number + "").contains(this.first + "");
    }
}
