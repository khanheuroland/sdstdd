package Subscription.Stub;

import org.junit.jupiter.api.Test;
import samsungtdd.subscriber.Subscription;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SubscriptionFnTest {

    @Test
    public void should_return_false_after_subscribe_with_email_is_subscripted()
    {
        //Arrange
        String email = "khanh.tx@live.com";
        boolean expected = false;

        // Create sub
        SubscriptionRepositoryStub stubRepository = new SubscriptionRepositoryStub();
        Subscription sub = new Subscription(stubRepository);

        //Act
        boolean actual = sub.subscribe(email);

        assertThat(actual, equalTo(expected));

    }

    @Test
    public void should_return_true_after_subscribe_with_new_email()
    {
        //Arrange
        String email = "txk2601@gmail.com";
        boolean expected = true;

        // Create sub
        SubscriptionRepositoryStub stubRepository = new SubscriptionRepositoryStub();
        Subscription sub = new Subscription(stubRepository);

        //Act
        boolean actual = sub.subscribe(email);

        assertThat(actual, equalTo(expected));
    }
}
