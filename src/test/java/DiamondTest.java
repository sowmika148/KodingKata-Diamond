import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DiamondTest {

    @Test
    public void shouldPrintBSpaceBForLetterB(){
        Diamond diamond = new Diamond('B');
        assertEquals("B B\n", diamond.printCharacter(2));
    }

    @Test
    public void shouldPrintBSpaceBForLetterC(){
        Diamond diamond = new Diamond('C');
        assertEquals(" B B \n", diamond.printCharacter(2));
    }

    @Test
    public void shouldPrintSpaceSpaceASpaceSpaceForLetterC(){
        Diamond diamond = new Diamond('C');
        assertEquals("  A  \n", diamond.printCharacter(1));
    }

}