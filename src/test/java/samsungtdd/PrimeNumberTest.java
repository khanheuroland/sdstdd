package samsungtdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {  /* [Class Under Test]Test */
    PrimeNumber PrimeNumber;
    @BeforeEach
    public void setup()
    {
        this.PrimeNumber = new PrimeNumber();
    }
    @Test /*Mark this is a testcase*/
    @Disabled
    public void should_return_fasle_with_number_less_than_2()
    {
        //Arrange - Gia thiet & kq mong muon
        int number = 2;
        boolean expected = false;

        //Act - Thuc thi function can viet
        boolean actual = PrimeNumber.check(number);

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void should_return_true_if_number_is_prime_number()
    {
        //Arrange
        int number =11;
        boolean expected=true;

        //Act
        boolean actual = PrimeNumber.check(number);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_false_with_non_prime_number()
    {
        //Arrange
        int number = 9;
        boolean expected=false;

        //Act
        boolean actual = PrimeNumber.check(number);

        //
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_exception_with_negative_number()
    {
        //Arrange
        int number = -9;

        //Get exception
        Exception ex= assertThrows(IllegalArgumentException.class, ()-> PrimeNumber.check(number));
        assertEquals(ex.getMessage(), "Number should be integer number!");
    }
}
