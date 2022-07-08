package ru.netology.mavenjava;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

    public class BonusServiceTest {

        @ParameterizedTest
        @CsvFileSource(resources = "/data.csv")
        void shouldCalcBonus(String userInfo, String bonusStatus, long expected, long amount, boolean registered) {
            BonusService service = new BonusService();
            long actual = service.calculate(amount, registered);
            assertEquals(expected, actual);
        }
    }
