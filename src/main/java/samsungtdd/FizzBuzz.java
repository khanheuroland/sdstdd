package samsungtdd;

public class FizzBuzz {
    public String[] getFizzBuzz(int inputNumber) {
        if(inputNumber<=0)
            throw new IllegalArgumentException("Number should be possitive number.");

        String[] arr = new String[inputNumber];
        for (int i = 1; i <=inputNumber ; i++) {
            String value = String.valueOf(i);
            if(i%15==0)
                value = "FizzBuzz";
            else if(i%5==0)
                value = "Buzz";
            else if (i%3==0)
                value = "Fizz";

            arr[i-1] = value;
        }
       return arr;
    }
}
