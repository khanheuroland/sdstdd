package samsungtdd;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SubscriptionTest {
    Subscription subObj = new Subscription();
    @BeforeEach
    public void setup_test()
    {
        subObj.lstEmail.clear();
    }
    @Test
    public void should_return_true_after_subscribe_with_valid_email_and_not_subscribe()
    {
        //Arrange
        String email="khanh.tx@live.com";
        boolean expected = true;

        //Act
        boolean actual = subObj.subscribe(email);

        //Assert
        assertThat(actual, equalTo(expected));
        assertThat(subObj.lstEmail, hasItem(email));
    }

    @Test
    public void should_return_false_after_subscribe_with_valid_email_but_already_in_used()
    {
        //Arrange
        String email="khanh.tx@live.com";
        subObj.lstEmail.add(email);
        boolean expected =false;
        //Act
        boolean actual = subObj.subscribe(email);

        //Assertion
        assertThat(actual, equalTo(expected));
    }

    @Test
    public void should_return_exception_after_subscribe_email_not_valid()
    {
        String input ="khanh.tx";
        //khanh tx@live.com
        //khanh_tx@live com
        //khanh.tx@gmail.com.vn.md.com

        Exception ex = assertThrows(IllegalArgumentException.class, ()-> subObj.subscribe(input));
        assertThat(ex.getMessage(), equalTo("Email is invalid!"));
    }

    @Test
    public void should_throw_exception_after_subscribe_with_null()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> subObj.subscribe(null));
        assertThat(ex.getMessage(), equalTo("Email is invalid!"));
    }
}
