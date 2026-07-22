import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    public void testGreeting() {

        assertEquals(
                "Hello G.PRAVEEN",
                Hello.greet("G.PRAVEEN")
        );

    }
}