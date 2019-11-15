package inheritance.stragery;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(new StringBuilder()
                        .append("++++")
                        .append("+     +")
                        .append("+     +")
                        .append("++++")
                        .toString()
                )
        );
    }
}