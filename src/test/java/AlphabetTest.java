import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlphabetTest {

    @Test
    public void shouldReturn3ForLetterC() {
        Alphabet alphabet = new Alphabet('C');
        assertEquals(3, alphabet.getPosition());
    }

    @Test
    public void shouldReturn26ForLetterZ() {
        Alphabet alphabet = new Alphabet('Z');
        assertEquals(26, alphabet.getPosition());
    }

    @Test
    public void shouldReturnZForNumber26() {
        Alphabet alphabet = new Alphabet(26);
        assertEquals('Z', alphabet.getLetter());
    }

    @Test
    public void shouldReturnTForNumber20() {
        Alphabet alphabet = new Alphabet(20);
        assertEquals('T', alphabet.getLetter());
    }

}