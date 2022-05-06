import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class TestReturnNthCharacter {

    final String word = "ITCLiNicAl";
    final String newWord = "!tCL1Nical";
    final String counterWord = "ItCLINiCAL";


    ReturnNthCharacter returnNthCharacter;

    @Before
    public void setUp() {
        returnNthCharacter = new ReturnNthCharacter();
    }

    @Test
    public void testReturnNthCharacterNegative() {
        assertEquals(returnNthCharacter.returnNthCharacterFrom(word, -1), "");
    }

    @Test
    public void testReturnNthCharacterBiggerThanWord() {
        assertEquals(returnNthCharacter.returnNthCharacterFrom(word, 100), "");
    }

    @Test
    public void testReturnNthCharacter() {
        assertEquals(returnNthCharacter.returnNthCharacterFrom(word, 1), "ITCLNA");
        assertEquals(returnNthCharacter.returnNthCharacterFrom(word, 2), "TLN");
        assertEquals(returnNthCharacter.returnNthCharacterFrom(word, 3), "CNA");
        assertEquals(returnNthCharacter.returnNthCharacterFrom(word, 10), "");
    }

    @Test
    public void testSpecialReturnNthCharacter() {
        assertEquals(returnNthCharacter.returnNthCharacterFrom(newWord, 1), "!CL1N");
    }

    @Test
    public void testCounter() {
        assertEquals(returnNthCharacter.returnNthCharacterFrom(counterWord, 1), "ICLINCAL");
    }


}
