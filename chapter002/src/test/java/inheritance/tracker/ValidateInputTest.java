package inheritance.tracker;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {

    @Test
    public void whenInvalidInputNFE() {
        ByteArrayOutputStream nfe = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(nfe));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "1"})
        );
        input.askInt("Enter", 1);
        assertThat(
                nfe.toString(),
                is(String.format("Please enter validate data again %n"))
        );
        System.setOut(out);
    }

    @Test
    public void whenInvalidInputMOE() {
        ByteArrayOutputStream moe = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(moe));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"7", "1"})
        );
        input.askInt("Enter", 1);
        assertThat(
                moe.toString(),
                is(String.format("Please select key from menu %n"))
        );
        System.setOut(def);
    }
}