package samsungtdd.subscriber;

public class TryDemo {
    public static void main(String[] args) {
        ISubscriptionRepository repository = new SubscriptionRepository();
        Subscription sub = new Subscription(repository);

        boolean result = sub.subscribe("txk2601@live.com");

        System.out.println(result);
    }
}
