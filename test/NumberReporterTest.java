import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by afaren on 9/17/16.
 */
public class NumberReporterTest {
    @Test
    public void should_report_1_when_given_1() throws Exception {
        NumberReporter numberReporter = new NumberReporter();
        assertEquals(1, numberReporter.report(1));

    }

    @Test
    public void should_report_special_string_when_given_special() throws Exception {
        NumberReporter numberReporter = new NumberReporter();
        HashMap<Integer, String> specialMap = new HashMap<>();
        specialMap.put(3, "fizz");
        specialMap.put(5, "buzz");
        specialMap.put(7, "whizz");

        specialMap.forEach((key, value) -> assertEquals(value, numberReporter.report(key)));

    }
}