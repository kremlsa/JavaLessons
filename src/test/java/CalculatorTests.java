import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculatorTests {
    @ParameterizedTest(name = "{index} => maxOf({0}, {1}) == {2}")
    @CsvSource({"2, 1, 2", "1, 2, 2", "1, 1, 1"})
    void textMax(int first, int second, int expected) {
        Calculator calculator = new Calculator();
        int result = calculator.maxOf(first, second);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = { 0, 2, 4, 1000 })
    void testIsEven(int arg) {
        assertTrue(new Calculator().isEven(arg));
    }

    @ParameterizedTest
    @EmptySource
    void testEmpty(int[] arg) {
        assertEquals(0, arg.length);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testNullAndEmpty(List<String> arg) {
        assertTrue(arg == null || arg.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringFactory")
    void testStrings(String str) {
        assertFalse(str.isEmpty());
    }

    static List<String> stringFactory() {
        return List.of("apple", "banana", "lemon", "orange");
    }

    @ParameterizedTest
    @MethodSource("argFactory")
    void testStringLength(String str, int length) {
        assertEquals(length, str.length());
    }

    static List<Arguments> argFactory() {
        return List.of(arguments("apple", 5), arguments("watermelon", 10));
    }



}