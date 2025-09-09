package samsungtdd.subscriber;

import samsungtdd.Common.Utility;

import java.util.List;

public class Subscription {
    ISubscriptionRepository repository;
    public Subscription(ISubscriptionRepository repository)
    {
        this.repository = repository;
    }

    public boolean subscribe(String email) {
        if(Utility.validateEmail(email))
        {
            List<String> subscribeList= this.repository.getAllSubscriber();
            if(subscribeList.contains(email))
            {
                return false;
            }
            else
            {
                subscribeList.add(email);
                //Call repository to save List -> data
                this.repository.save(subscribeList);
                return true;
            }
        }
        return false;
    }
}
