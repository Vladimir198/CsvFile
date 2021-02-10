package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @ParameterizedTest(name = "Test{index} {0}")
    @CsvFileSource(resources = "/data.csv")

    void shouldCalculate(String testName, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);


    }
}
