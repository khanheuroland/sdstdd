package DataDriven;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ParameterizedSampleTest {
    @ParameterizedTest
    @ValueSource(strings = {"value1", "value2", "value3"})
    public void test_repeat(String input)
    {
        System.out.println(input);
    }

    @ParameterizedTest
    @CsvSource({"2,3,5","10,5,15","10,20,30"})
    public void test_csv_data_source(int f_number, int s_number, int sum)
    {
        assertThat(f_number+s_number, equalTo(sum));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    public void test_csv_file(int f_number, int s_number, int sum)
    {
        assertThat(f_number+s_number, equalTo(sum));
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    public void test_method_source(String input, int expectedLength)
    {
        assertThat(input.length(), equalTo(expectedLength));
    }

    static Stream<Arguments> stringProvider(){
        return Stream.of(
                Arguments.of("JUnit", 5),
                Arguments.of("Hello", 5),
                Arguments.of("World", 5)
        );
    }

    @Test
    @DisabledOnOs({OS.MAC})
    public void only_execute_on_windows()
    {
        System.out.println("Run on Windows");
    }
}
