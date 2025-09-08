package samsungtdd;

public class PrimeNumber {
    public static boolean check(int number) {
        if(number<=2 && number>0)
            return false;
        else if(number>2)
        {
            boolean isPrimeNumber = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number%i==0)
                {
                    isPrimeNumber=false;
                    break;
                }
            }
            return isPrimeNumber;
        }
        else {
            throw new IllegalArgumentException("Number should be integer number!");
        }
    }
}
