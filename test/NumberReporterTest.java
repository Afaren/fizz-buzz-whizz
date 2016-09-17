import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by afaren on 9/17/16.
 */
public class NumberReporterTest {

    NumberReporter numberReporter;

    @Before
    public void setUp() throws Exception {
        numberReporter = new NumberReporter();
    }

    @Test
    public void should_report_1_when_given_1() throws Exception {
        assertThat(numberReporter.report(1), is(1));
    }

    @Test
    public void should_report_special_string_when_given_special() throws Exception {
        HashMap<Integer, String> specialMap = new HashMap<>();
        specialMap.put(3, "Fizz");
        specialMap.put(5, "Buzz");
        specialMap.put(7, "Whizz");

        specialMap.forEach((key, value) -> assertThat(numberReporter.report(key), is(value)));

    }

    @Test
    public void should_report_special_string_when_given_double_number() throws Exception {
        assertThat(numberReporter.report(15), is("FizzBuzz"));
        assertThat(numberReporter.report(21), is("FizzWhizz"));
        assertThat(numberReporter.report(70), is("BuzzWhizz"));
    }
}