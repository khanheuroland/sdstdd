package samsungtdd.subscriber;

import java.util.List;

public interface ISubscriptionRepository {
    public List<String> getAllSubscriber();

    void save(List<String> subscribeList);
}
