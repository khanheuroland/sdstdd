package samsungtdd.Refactor;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class BankInterestCalculator {
    public enum AccountType
    {
        STANDARD, PREMIUM, VIP
    }

    private Map<AccountType, InterestStrategy> strategies = new EnumMap<>(AccountType.class);
    public BankInterestCalculator(){
        strategies.put(AccountType.STANDARD, new StandardInterestStrategy());
        strategies.put(AccountType.PREMIUM, new PremiumInterestStrategy());
        strategies.put(AccountType.VIP, new VipInterestStrategy());
    }

    public double calculateInterest(double principal, int months, AccountType type) {
        if(principal<=0 ||months<=0) return 0.0;
        InterestStrategy strategy = strategies.get(type);
        if(strategy==null) throw new IllegalArgumentException("Unknow account type");
        double rate = strategy.calculateRate(months);
        return principal*rate*months/12;
    }
}