package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {
        String input = "Hello|World";
        String separator = "\\|";
        StringParser sp = new StringParser();
        ArrayList<String> stringParts = sp.splitString(input, separator);
        assertEquals(2, stringParts.size());
    }
    @Test
    void splitString_nullInput_expectException() {
        String input = null;
        String separator = "\\|";
        StringParser sp = new StringParser();
        //ArrayList<String> stringParts = sp.splitString(input, separator);
        assertThrows(InvalidStringInputException.class, () -> sp.splitString(input, separator));
    }
}