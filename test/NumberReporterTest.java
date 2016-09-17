import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by afaren on 9/17/16.
 */
public class NumberReporterTest {
    @Test
    public void should_report_1_when_given_1() throws Exception {
        NumberReporter numberReporter = new NumberReporter();
        assertThat(numberReporter.report(1), is(1));
    }

    @Test
    public void should_report_special_string_when_given_special() throws Exception {
        NumberReporter numberReporter = new NumberReporter();
        HashMap<Integer, String> specialMap = new HashMap<>();
        specialMap.put(3, "fizz");
        specialMap.put(5, "buzz");
        specialMap.put(7, "whizz");

        specialMap.forEach((key, value) -> assertThat(numberReporter.report(key), is(value)));

    }
}