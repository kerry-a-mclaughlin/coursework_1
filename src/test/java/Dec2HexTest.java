import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Test
    public void testDec2Hex_whenNumberIsGiven_ThenConvertToHex() {
        String[] args = {"15"};
        String hex = "F";

        String actualHex = Dec2Hex.receiveInputAndConvertToIntegerAndConvertToHex(args);

        assertEquals(actualHex, hex);
    }
}