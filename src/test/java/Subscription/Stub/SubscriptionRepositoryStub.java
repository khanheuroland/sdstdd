package Subscription.Stub;

import samsungtdd.subscriber.ISubscriptionRepository;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionRepositoryStub implements ISubscriptionRepository {
    @Override
    public List<String> getAllSubscriber() {
        List<String> lstSubscriber = new ArrayList<>();
        lstSubscriber.add("khanh.tx@live.com");

        return lstSubscriber;
    }

    @Override
    public void save(List<String> subscribeList) {

    }
}
