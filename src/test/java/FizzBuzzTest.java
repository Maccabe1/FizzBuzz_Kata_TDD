package test.java;

import main.java.FizzBuzz;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void zeroEqualsZero() {
        assertThat(FizzBuzz.check(0), is("0"));
    }

    @Test
    public void oneEqualsZero() {
        assertThat(FizzBuzz.check(1), is("1"));
    }

    @Test
    public void threeEqualsFizz() {
        assertThat(FizzBuzz.check(3), is("Fizz"));
    }

    @Test
    public void fiveEqualsBuzz() {
        assertThat(FizzBuzz.check(5), is("Buzz"));
    }

    @Test
    public void sixEqualsFizz() {
        assertThat(FizzBuzz.check(6), is("Fizz"));
    }

    @Test
    public void tenEqualsBuzz() {
        assertThat(FizzBuzz.check(10), is("Buzz"));
    }

    @Test
    public void fifteenEqualsFizzBuzz() {
        assertThat(FizzBuzz.check(15), is("FizzBuzz"));
    }
}
