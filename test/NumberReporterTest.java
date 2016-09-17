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
        numberReporter = new NumberReporter(3, 5, 7);
    }

    @Test
    public void should_report_1_when_given_1() throws Exception {
	assertReport(1, new Integer(1));
    }

    @Test
    public void should_report_special_string_when_given_special_number() throws Exception { 
	assertReport(3, "Fizz");
	assertReport(5, "Buzz");
	assertReport(7, "Whizz");
	
    }
    @Test
    public void should_report_special_string_when_given_double_number() throws Exception {
        assertThat(numberReporter.report(15), is("FizzBuzz"));
        assertThat(numberReporter.report(21), is("FizzWhizz"));
        assertThat(numberReporter.report(70), is("BuzzWhizz"));
    }

    @Test
    public void should_report_special_string_when_given_contain_three() throws Exception {
        assertThat(numberReporter.report(13), is("Fizz"));
    }

    @Test
    public void should_report_special_string_when_given_contain_three_and_double_numbers() throws Exception {
        assertThat(numberReporter.report(35), is("Fizz"));
        assertThat(numberReporter.report(105), is("FizzBuzzWhizz"));
    }


    private void assertReport(int number, Object tag){
	assertThat(numberReporter.report(number), is(tag));
     }
    
}
