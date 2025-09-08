package samsungtdd;

public class FizzBuzz {
    public String[] getFizzBuzz(int n) {
        if(n<=0)
            throw new IllegalArgumentException("Number should be possitive number.");

        String[] arr = new String[n];
        for (int i = 1; i <=n ; i++) {
            if(i%3==0 && i%5==0)
                arr[i-1] = "FizzBuzz";
            else if(i%5==0)
                arr[i-1] = "Buzz";
            else if (i%3==0)
                arr[i-1] = "Fizz";
            else
                arr[i-1] = String.valueOf(i);
        }
        return arr;
    }
}
