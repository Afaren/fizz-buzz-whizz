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
	assertReport(15, "FizzBuzz");
	assertReport(21, "FizzWhizz");
	assertReport(70, "BuzzWhizz");
    }

    @Test
    public void should_report_special_string_when_given_contain_three() throws Exception {
	assertReport(13, "Fizz");
    }

    @Test
    public void should_report_special_string_when_given_contain_three_and_double_numbers() throws Exception {
	assertReport(35, "Fizz"); // 5 * 7
	assertReport(105, "FizzBuzzWhizz");
    }


    private void assertReport(int number, Object tag){
	assertThat(numberReporter.report(number), is(tag));
     }
    
}
