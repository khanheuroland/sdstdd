package Subscription.Mock;

import Subscription.Stub.SubscriptionRepositoryStub;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import samsungtdd.subscriber.ISubscriptionRepository;
import samsungtdd.subscriber.Subscription;
import samsungtdd.subscriber.SubscriptionRepository;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;

public class SubscriptionFnTest {
    @Test
    public void should_return_false_after_subscribe_with_email_is_subscripted()
    {
        //Arrange
        String email = "khanh.tx@live.com";
        boolean expected = false;

        // setup mock
        ISubscriptionRepository repository = mock(SubscriptionRepository.class);
        //Create mock arrange
        when(repository.getAllSubscriber()).thenReturn(List.of("khanh.tx@live.com", "txk2601@gmail.com"));
        Subscription sub = new Subscription(repository); //Pass mock object into class under test

        //Act
        boolean actual = sub.subscribe(email);

        assertThat(actual, equalTo(expected));
        verify(repository, times(0)).save(anyList());

    }

    @Test
    public void should_return_true_after_subscribe_with_new_email()
    {
        //Arrange
        String email = "txk2601@gmail.com";
        boolean expected = true;

        List<String> lstList = new ArrayList<>();
        lstList.add("khanh.tx@live.com");
        // setup mock
        ISubscriptionRepository repository = mock(SubscriptionRepository.class);
        when(repository.getAllSubscriber()).thenReturn(lstList);
        Subscription sub = new Subscription(repository);

        //Act
        boolean actual = sub.subscribe(email);

        assertThat(actual, equalTo(expected));
        verify(repository, times(1)).save(lstList);
    }
}
