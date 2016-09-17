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
    public void should_report_combine_string_when_can_be_mod_by_more_than_one_rule() throws Exception {
	assertReport(15, "FizzBuzz");
	assertReport(21, "FizzWhizz");
	assertReport(70, "BuzzWhizz");
	assertReport(105, "FizzBuzzWhizz");
    }

    @Test
    public void should_report_Fizz_when_contains_first_number()throws Exception {
	assertReport(13, "Fizz");
    }

    @Test
    public void should_report_Fizz_when_contains_first_number_and_can_be_mod() throws Exception {
	assertReport(35, "Fizz"); // 5 * 7

    }


    private void assertReport(int number, Object tag){
	assertThat(numberReporter.report(number), is(tag));
     }
    
}
