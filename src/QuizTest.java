import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by ykhdzr on 4/12/16.
 */
public class QuizTest {

    @Test
    public void testFizzBuzz() {
        assertEquals("", Quiz.fizzBuzz(0));
        assertEquals("1,2,fizz,4,buzz,fizz,7,8,fizz,buzz", Quiz.fizzBuzz(10));
        assertEquals("1,2,fizz,4,buzz,fizz,7,8,fizz,buzz,11,fizz,13,14,fizzbuzz,16,17,fizz,19,buzz",
                Quiz.fizzBuzz(20));
        assertEquals("", Quiz.fizzBuzz(-1));
    }

    @Test
    public void testReverseString() {
        assertEquals("", Quiz.reverseString(""));
        assertEquals("A", Quiz.reverseString("A"));
        assertEquals("AB", Quiz.reverseString("BA"));
        assertEquals("Reverse me back", Quiz.reverseString("kcab em esreveR"));
    }

    @Test
    public void testSwapNumber() {
        NumberGroup numberGroup = new NumberGroup();
        numberGroup.setA(2);
        numberGroup.setB(5);

        assertEquals(5, Quiz.swapNumber(numberGroup).getA());
        assertEquals(2, Quiz.swapNumber(numberGroup).getB());
    }
}
