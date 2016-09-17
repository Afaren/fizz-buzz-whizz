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


    @Test
    public void should_report_buzz_when_given_5() throws Exception {
        NumberReporter numberReporter = new NumberReporter();
        assertEquals("buzz", numberReporter.report(5));

    }

    @Test
    public void should_report_whizz_when_given_7() throws Exception {
        NumberReporter numberReporter = new NumberReporter();
        assertEquals("whizz", numberReporter.report(7));

    }

}