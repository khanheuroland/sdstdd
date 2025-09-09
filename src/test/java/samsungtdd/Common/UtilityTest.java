package samsungtdd.Common;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class UtilityTest {
    @Test
    void testValidEmail() {
        boolean result = Utility.validateEmail("test.email_123@example.com");
        assertThat(result, is(true));
    }

    @Test
    void testEmailWithoutAtSymbol() {
        boolean result = Utility.validateEmail("invalid.email.com");
        assertThat(result, is(false));
    }

    @Test
    void testEmailWithInvalidCharacters() {
        boolean result = Utility.validateEmail("test!email@example.com");
        assertThat(result, is(false));
    }

    @Test
    void testEmptyEmail() {
        boolean result = Utility.validateEmail("");
        assertThat(result, is(false));
    }

    @Test
    void testNullEmail() {
        boolean result = Utility.validateEmail(null);
        assertThat(result, is(false));
    }

    @Test
    void testEmailWithShortTLD() {
        boolean result = Utility.validateEmail("user@domain.c");
        assertThat(result, is(false));
    }

    @Test
    void testEmailWithLongTLD() {
        boolean result = Utility.validateEmail("user@domain.com");
        assertThat(result, is(true));
    }
}
