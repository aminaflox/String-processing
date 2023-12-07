import junit.framework.TestCase;
import org.example.StringProcessor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {
//for password checking
    @Test
    public void testForTrue() {
        StringProcessor strongPassword = new StringProcessor();
        assertTrue(strongPassword.isStringPassword("StrongPassword1!1"));
        assertEquals(true, strongPassword.isStringPassword("hHeh6+?"));
        boolean True;
        assertEquals(True=true, strongPassword.isStringPassword("Ala-Too_1996!"));
        assertFalse(strongPassword.isStringPassword("objectorientedProgramming"));
        assertTrue(strongPassword.isStringPassword("Obj0rntdProgr@mm1ng"));
        assertFalse(strongPassword.isStringPassword("123456789"));
    }
//to count digits
    @Test
    public void digitTest(){
        StringProcessor digit = new StringProcessor();
        assertEquals(6, digit.calculateDigits("I'm 21 years old, born in 2002"));
        assertEquals(6, digit.calculateDigits("123456"));
        assertEquals(0, digit.calculateDigits("three, two, one"));
        assertNotEquals(3, digit.calculateDigits("four, five, six"));
    }
// to count words
    @Test
    public void correctWordCalc(){
        StringProcessor words = new StringProcessor();
        assertEquals(4, words.calculateWords("My name is Amina."));
        assertNotEquals(5, words.calculateWords("My name is Amina."));
        assertNotEquals(3, words.calculateWords("my name is 'Amina' "));
        assertEquals(4, words.calculateWords("my name is 'Amina' "));
    }





//    @Test
//    public void testTrue() {
//        StringProcessor strongPassword = new StringProcessor();
//        boolean True;
//        assertEquals(True=true, strongPassword.isStringPassword("Ala-Too_1996!"));
//    }

//    @Test
//    public void testForFalse(){
//        StringProcessor strongPassword = new StringProcessor();
//        assertFalse(strongPassword.isStringPassword("objectorientedProgramming"));
//    }

//    @Test
//    public void strongPass(){
//        StringProcessor strongPassword = new StringProcessor();
//        assertTrue(strongPassword.isStringPassword("Obj0rntdProgr@mm1ng"));
//    }

//    @Test
//    public void numericPass(){
//        StringProcessor strongPassword = new StringProcessor();
//        assertFalse(strongPassword.isStringPassword("123456789"));
//    }
//digit counter


//    @Test
//    public void secondDigitTest(){
//        StringProcessor digit = new StringProcessor();
//        assertEquals(6, digit.calculateDigits("123456"));
//    }
//
//    @Test
//    public void failedTest(){
//        StringProcessor digit = new StringProcessor();
//        assertEquals(0, digit.calculateDigits("three, two, one"));
//    }

//    @Test
//    public void notEqual(){
//        StringProcessor digit = new StringProcessor();
//        assertNotEquals(3, digit.calculateDigits("four, five, six"));
//    }


    //word calculator


//    @Test
//    public void wrongWordCalc(){
//        StringProcessor words = new StringProcessor();
//        assertNotEquals(5, words.calculateWords("My name is Amina."));
//    }

//    @Test
//    public void testTest(){
//        StringProcessor words = new StringProcessor();
//        assertNotEquals(3, words.calculateWords("my name is 'Amina' "));
//        assertEquals(4, words.calculateWords("my name is 'Amina' "));
//    }

}
