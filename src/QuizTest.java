import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.*;

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
    public void testIsAnagram() {
        assertFalse(Quiz.isAnagram("arm", "mary"));
        assertTrue(Quiz.isAnagram("", ""));
        assertTrue(Quiz.isAnagram("word", "wrdo"));
        assertTrue(Quiz.isAnagram("mary", "army"));
        assertTrue(Quiz.isAnagram("stop", "tops"));
        assertTrue(Quiz.isAnagram("boat", "btoa"));
        assertFalse(Quiz.isAnagram("pure", "in"));
        assertFalse(Quiz.isAnagram("fill", "fil"));
        assertFalse(Quiz.isAnagram("b", "bbb"));
        assertFalse(Quiz.isAnagram("ccc", "ccccccc"));
        assertTrue(Quiz.isAnagram("a", "a"));
        assertFalse(Quiz.isAnagram("sleep", "slep"));
        assertFalse(Quiz.isAnagram(null, "Ryme"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(Quiz.isPalindrome("tamat"));
        assertTrue(Quiz.isPalindrome(""));
        assertTrue(Quiz.isPalindrome("katak"));
        assertTrue(Quiz.isPalindrome("makam"));
        assertTrue(Quiz.isPalindrome("malam"));
        assertFalse(Quiz.isPalindrome("bobo"));
        assertTrue(Quiz.isPalindrome("radar"));
        assertFalse(Quiz.isPalindrome(null));
    }

    @Test
    public void testSwapNumber() {

    }

    @Test
    public void testObjectReferences() {
        String[] resArr = {/* your answer here */};
        List<String> result = Arrays.asList(resArr);

        assertEquals(result, MyClass.getResult());
    }

    @Test
    public void testShowingList(){
        /*
        * 1. Clone Repo
        * 2. Hit API [put api here]
        * 3. Show in a list
        * */
    }

    @Test
    public void testDebugging(){
        /*
        * 1. Please run Koneksee project
        * 2. Cannot go to next screen
        * 3. Please debug
        * */
    }

    @Test
    public void testGit(){
        /*
        * 1. What git pull does ?
        * 2. What git pull --rebase does ?
        * 3. Git Merge vs Git Rebase ?
        * */
    }
}
