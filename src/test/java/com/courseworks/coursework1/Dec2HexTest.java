package com.courseworks.coursework1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Dec2HexTest {

    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    Dec2Hex dec2Hex = new Dec2Hex();

    @Before
    public void init() {
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testDec2Hex_whenNumberIsGiven_ThenConvertToHex() {
        String args = "15";
        String hex = "F";

        String actualHex = dec2Hex.convertInputToIntegerAndConvertToHex(args);

        assertEquals(actualHex, hex);
    }

    @Test(expected = NumberFormatException.class)
    public void testDec2Hex_whenStringIsGiven_Exception() {
        String args = "hi";
        dec2Hex.convertInputToIntegerAndConvertToHex(args);

        String expected = "Argument hi must be an integer.";
        assertTrue(errContent.toString().contains(expected));

    }

    @Test(expected = InputMismatchException.class)
    public void testDec2Hex_whenNoInputIsGiven_Exception() {
        String args = "";
        dec2Hex.convertInputToIntegerAndConvertToHex(args);

        String expected = "Please enter an integer.";
        assertTrue(errContent.toString().contains(expected));
    }
}