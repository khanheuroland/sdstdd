import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinhTinhTest {
    @Test
    public void test_assertion_clear()
    {
        String s1 = "Hello world!";
        String s2 = new String("Hello world!");

        //assertEquals(s1, s2);
        //assertTrue(s1==s2);

        assertThat(s1, equalTo(s2));
    }

    @Test
    public void test_statble_asssert()
    {
        List<Integer> lstLuckyNumber = new ArrayList<>();
        lstLuckyNumber.add(2);
        lstLuckyNumber.add(10);
        lstLuckyNumber.add(3);
        ///
        ///

        //assertThat(lstLuckyNumber, contains(1,2));
        assertThat(lstLuckyNumber, anyOf(hasItem(1), hasItem(2)));
    }
}
