import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit(){
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);


    }

    @Test
    void shouldCalculateRegisteredAndOverLimit(){
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);


    }
    @Test
    void shouldCalculatedRegisteredAndNearUnderLimit() {
        BonusService service = new BonusService();

        long amount = 16_633_34;
        boolean registered = true;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculatedRegisteredAnd0() {
        BonusService service = new BonusService();

        long amount = 000;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculatedRegisteredAndLessThanTheMinimum() {
        BonusService service = new BonusService();

        long amount = -1;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculatedNonRegisteredAndLessThanTheMinimum() {
        BonusService service = new BonusService();

        long amount = -1;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculatedNonRegisteredAnd0() {
        BonusService service = new BonusService();

        long amount = 000;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculatedNonRegisteredAndMinimum() {
        BonusService service = new BonusService();

        long amount = 100_60;
        boolean registered = false;
        long expected = 1;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculatedNonRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 60_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculatedNonRegisteredAndNearUnderLimit() {
        BonusService service = new BonusService();

        long amount = 49900_60;
        boolean registered = false;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

}