package inheritance.stragery;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(new StringBuilder()
                        .append("   *")
                        .append("  ***")
                        .append(" *****")
                        .append("*******")
                        .toString()
                )
        );
    }
}