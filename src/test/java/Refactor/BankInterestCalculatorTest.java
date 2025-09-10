package Refactor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import samsungtdd.Refactor.BankInterestCalculator;
import samsungtdd.Refactor.BankInterestCalculator.AccountType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankInterestCalculatorTest {
    BankInterestCalculator calc = new BankInterestCalculator();
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void should_interest_calculated_for_stardard_below_6_month(int month)
    {
        double principal = 10000;
        double expected = 10000*0.03*month/12;
        double interest = calc.calculateInterest(10000, month, AccountType.STANDARD);
        //assertThat(interest, equalTo(expected));
        assertEquals(expected, interest, 0.001);

    }

    @ParameterizedTest
    @ValueSource(ints = {6,7,8,9,10,11})
    public void should_return_interest_calculated_for_standard_in_6_to_12_month(int month){
        double principal = 10000;
        double expected = 10000*0.045*month/12;
        double interest = calc.calculateInterest(10000, month, AccountType.STANDARD);
        //assertThat(interest, equalTo(expected));

        assertEquals(expected, interest, 0.001);
    }

    @ParameterizedTest
    @ValueSource(ints = {12,13,14,15})
    public void should_return_interest_calculated_for_standard_over_12_month(int month)
    {
        double principal = 10000;
        double expected = 10000*0.06*month/12;
        double interest = calc.calculateInterest(10000, month, AccountType.STANDARD);
        //assertThat(interest, equalTo(expected));

        assertEquals(expected, interest, 0.001);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void should_interest_calculated_for_premium_below_6_month(int month)
    {
        double principal = 10000;
        double expected = 10000*0.05*month/12;
        double interest = calc.calculateInterest(10000, month, AccountType.PREMIUM);
        //assertThat(interest, equalTo(expected));

        assertEquals(expected, interest, 0.001);
    }

    @ParameterizedTest
    @ValueSource(ints = {6,7,8,9,10,11})
    public void should_interest_calculated_for_premium_from_6_to_12_month(int month)
    {
        double principal = 10000;
        double expected = 10000*0.065*month/12;
        double interest = calc.calculateInterest(10000, month, AccountType.PREMIUM);
        //assertThat(interest, equalTo(expected));

        assertEquals(expected, interest, 0.001);
    }

    @ParameterizedTest
    @ValueSource(ints = {12,13,14,15})
    public void should_return_interest_calculated_for_premium_over_12_month(int month)
    {
        double principal = 10000;
        double expected = 10000*0.08*month/12;
        double interest = calc.calculateInterest(10000, month, AccountType.PREMIUM);
        //assertThat(interest, equalTo(expected));

        assertEquals(expected, interest, 0.001);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void should_interest_calculated_for_vip_below_6_month(int month)
    {
        double principal = 10000;
        double expected = 10000*0.07*month/12;
        double interest = calc.calculateInterest(10000, month, AccountType.VIP);
        //assertThat(interest, equalTo(expected));
        assertEquals(expected, interest, 0.001);
    }

    @ParameterizedTest
    @ValueSource(ints = {6,7,8,9,10,11})
    public void should_interest_calculated_for_vip_from_6_to_12_month(int month)
    {
        double principal = 10000;
        double expected = 10000*0.085*month/12;
        double interest = calc.calculateInterest(10000, month, AccountType.VIP);
        //assertThat(interest, equalTo(expected));

        assertEquals(expected, interest, 0.001);
    }

    @ParameterizedTest
    @ValueSource(ints = {12,13,14,15})
    public void should_return_interest_calculated_for_vip_over_12_month(int month)
    {
        double principal = 10000;
        double expected = 10000*0.1*month/12;
        double interest = calc.calculateInterest(10000, month, AccountType.VIP);
        //assertThat(interest, equalTo(expected));

        assertEquals(expected, interest, 0.001);
    }
}
