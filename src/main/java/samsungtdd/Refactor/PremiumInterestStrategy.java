package samsungtdd.Refactor;

public class PremiumInterestStrategy implements InterestStrategy{
    @Override
    public double calculateRate(int months) {
        if(months<6) return 0.05;
        else if(months<12) return 0.065;
        else return 0.08;
    }
}
