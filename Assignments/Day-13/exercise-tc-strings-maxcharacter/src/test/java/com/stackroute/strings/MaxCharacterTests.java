package com.stackroute.strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxCharacterTests 
{

    @Test
    public void checkMaxCharacterCountForAlphabets() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "Java";
        char expected = 'a';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Maximum Alphabet Character Count Test");
    }

    @Test
    public void checkMaxCharacterCountForDigits() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "11010234";
        char expected = '1';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Maximum Digits Character Count Test");
    }

    @Test
    public void checkMaxCharacterCountForSpecialCharacters() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "#%$@@";
        char expected = '@';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Maximum Special Character Count Test");
    }

    @Test
    public void checkMaxCharacterCountForEmptyString() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "";
        char expected = ' '; 
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Empty String Test");
    }



    @Test
    public void checkMaxCharacterCountForSingleCharacter() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "x";
        char expected = 'x';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Single Character Test");
    }

    @Test
    public void checkMaxCharacterCountForUniqueCharacters() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "abcdef";
        char expected = 'a';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Unique Characters Test");
    }

    @Test
    public void checkMaxCharacterCountForMixedCharacters() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "a1b2c3d4!!@@";
        char expected = '!';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Mixed Characters Test");
    }

    @Test
    public void checkMaxCharacterCountForLongString() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "a".repeat(1000) + "b".repeat(999);
        char expected = 'a';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Long String Test");
    }

    @Test
    public void checkMaxCharacterCountForCaseSensitivity() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "aAbBcC";
        char expected = 'a';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Case Sensitivity Test");
    }

    @Test
    public void checkMaxCharacterCountForWhitespaceCharacters() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "a a a  ";
        char expected = ' '; 
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Whitespace Characters Test");
    }


    @Test
    public void checkMaxCharacterCountForRepeatedCharactersWithSameFrequency() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "abbbc";
        char expected = 'b';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Repeated Characters with Same Frequency Test");
    }

    @Test
    public void checkMaxCharacterCountForNonPrintableCharacters() 
    {
        MaxCharacter maxchar = new MaxCharacter();
        String input = "a\u0000b\u0000c";
        char expected = '\u0000';
        assertEquals(expected, maxchar.findMaxCharacterCount(input), "Non-Printable Characters Test");
    }
}
