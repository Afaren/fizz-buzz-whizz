import org.junit.Test;

import static org.junit.Assert.*;

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
    public void should_report_fizz_when_given_3() throws Exception {
        NumberReporter numberReporter = new NumberReporter();
        assertEquals("fizz",numberReporter.report(3));

    }
}