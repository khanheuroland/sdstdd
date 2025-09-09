package samsungtdd.Common;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class UtilityTest {
    @ParameterizedTest
    @CsvSource({"test.email_123@example.com, true",
                "invalid.email.com, false",
                "test!email@example.com, false",
                " ,false",
                "user@domain.c, false",
                "user@domain.com, true"
    })
    public void should_valid_email_follow_data_from_parameterized(String input, boolean expected)
    {
        boolean result = Utility.validateEmail(input);
        assertThat(result, is(expected));
    }
}
