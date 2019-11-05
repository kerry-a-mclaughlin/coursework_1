import org.junit.Test;

public class Dec2HexTest {

    @Test
    public void testDec2Hex_whenNumberIsGiven_ThenConvertToHex() {
        String[] args = {"50"};

        Dec2Hex.recieveInputAndConvertToInteger(args);

    }
}