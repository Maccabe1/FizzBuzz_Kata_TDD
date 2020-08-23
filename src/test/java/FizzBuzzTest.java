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

    @Test
    public void threeEqualsFizz() {
        assertThat(FizzBuzz.returnOutput(3), is("Fizz"));
    }

    @Test
    public void fiveEqualsBuzz() {
        assertThat(FizzBuzz.returnOutput(5), is("Buzz"));
    }

    @Test
    public void sixEqualsFizz() {
        assertThat(FizzBuzz.returnOutput(6), is("Fizz"));
    }

    @Test
    public void tenEqualsBuzz() {
        assertThat(FizzBuzz.returnOutput(10), is("Buzz"));
    }

    @Test
    public void fifteenEqualsFizzBuzz() {
        assertThat(FizzBuzz.returnOutput(15), is("FizzBuzz"));
    }

    @Test
    public void twentyOneEqualsFizzBuzz() {
        assertThat(FizzBuzz.returnOutput(30), is("FizzBuzz"));
    }
}