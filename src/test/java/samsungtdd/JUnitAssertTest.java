package samsungtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitAssertTest {
    @Test
    public void JunitAssert()
    {
        //Kiem tra thuc te (acutal) co giong voi (expected) hay khong?
        //assertEquals("expected", "actual", "Mo ta cho hoat dong assert");
        int expected = 5;
        int actual = 6;
        //assertEquals(expected, actual, "Kiem tra gia tri tra ve co bang 5?");
        //assertNotEquals(expected, actual);
        //assertTrue(1==2);//Kiem tra dk co dung hay khong?
        //assertFalse(1==2);

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,4,3};
        assertArrayEquals(arr1, arr2);

        String name= "Nguyen Duy Hung";
        //Kiem tra name co end of Hung
        assertTrue(name.endsWith("Hung"));
        assertTrue(name.startsWith("Nguyen"));
        assertTrue(name.contains("Duy"));
        assertTrue(name.isEmpty());
        assertTrue(10>5);

        //Chi kiem tra exception throw ra
        assertThrows(IllegalArgumentException.class, ()->PrimeNumber.check(10));

        //TH muon kiem tra ca content
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> PrimeNumber.check(10));
        assertEquals("", ex.getMessage());

        //Hamcrest
        assertThat(name, endsWith("Hung"));
        assertThat(name, startsWith("Nguyen"));
        assertThat(name, containsString("Duy"));
        assertThat(name, emptyString());
        assertThat(10, greaterThan(5));
        assertThat(10, greaterThanOrEqualTo(5));
        assertThat(10, lessThan(5));
        assertThat(10, lessThanOrEqualTo(5));

        Exception ex2 = assertThrows(IllegalArgumentException.class, ()->PrimeNumber.check(10));
        assertThat(ex2.getMessage(), equalTo(""));
    }

    @Test
    public void HamcrestAssert()
    {
        //assertThat("actual", equalTo("expected"));
        //assertThat("actual", not(equalTo(("expected"))));
        //assertThat(1==1, is(true));
        //assertThat(1==2, is(false));
        String[] arr1 = {"1","2","3","4"};
        assertThat(Arrays.asList(arr1), contains("1","2","3", "4"));
        assertThat(Arrays.asList(arr1), hasItem("4")); //Kiem tra array arr1 co chua phan tu 4 ko?

        Integer[] arr2 = {1,2,3};

        //assertThat(arr1, arrayContainingInAnyOrder(arr2));
        assertThat(arr1, arrayContainingInAnyOrder("1","2","4","3"));
        assertThat(arr2, arrayContainingInAnyOrder(3,2,1));

        List<Integer> arrNumber = Arrays.asList(4,5,6);
        //Kiem tra xem trong list tat ca phan tu >3 ko?
        assertThat(arrNumber, everyItem(greaterThan(3)));
    }

    @Test
    public void test_every_item()
    {
        List<Integer> arrNumber = Arrays.asList(1,4,5,6);
        //Kiem tra xem trong list tat ca phan tu >3 ko?
        assertThat(arrNumber, everyItem(greaterThan(3)));
    }

    @Test
    public void test_compare_1_of_2_number()
    {
        int number =6;
        assertThat(number, allOf(greaterThan(5), lessThan(10)));
    }
}
