package samsungtdd.Refactor;

public class VipInterestStrategy implements InterestStrategy{
    @Override
    public double calculateRate(int months) {
        if(months<6) return 0.07;
        else if(months<12) return 0.085;
        else return 0.10;
    }
}
