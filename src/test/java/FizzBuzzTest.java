package test.java;

import main.java.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void zeroEqualsZero() {
        assertThat(FizzBuzz.returnOutput(0), is("0"));
    }
}