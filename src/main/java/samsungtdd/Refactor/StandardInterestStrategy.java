package samsungtdd.Refactor;

public class StandardInterestStrategy implements InterestStrategy{
    @Override
    public double calculateRate(int months) {
        if(months<6) return 0.03;
        else if(months<12) return 0.045;
        else return 0.06;
    }
}
