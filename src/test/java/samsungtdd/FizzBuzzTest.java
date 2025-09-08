package samsungtdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void should_return_output_contains_fizz_if_number_divisible_by_3()
    {
        //Arrange
        int n =3;
        String[] expected = {"1", "2", "Fizz"};

        //Act
        FizzBuzz fb = new FizzBuzz();
        String[] actual = fb.getFizzBuzz(n);

        //Assertion
        assertArrayEquals(expected, actual);
    }

    @Test
    public void result_contains_buzz_if_number_vivisible_by_5()
    {
        //Arrange
        int n =5;
        String[] expected = {"1", "2", "Fizz", "4", "Buzz"};

        //Act
        FizzBuzz fb = new FizzBuzz();
        String[] actual = fb.getFizzBuzz(n);

        //Assertion
        assertArrayEquals(expected, actual);
    }

    @Test
    public void result_contains_both_fizzbuzz_if_number_divisible_by_3_and_5()
    {
        int n = 15;
        String[] expected = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

        //Act
        FizzBuzz fb = new FizzBuzz();
        String[] actual = fb.getFizzBuzz(n);

        //Assertion
        assertArrayEquals(expected, actual);
    }

    @Test
    public void throw_exception_if_number_is_negative()
    {
        int n =0;
        FizzBuzz fb = new FizzBuzz();
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> fb.getFizzBuzz(n));
        assertEquals("Number should be possitive number.", ex.getMessage());
    }
}
