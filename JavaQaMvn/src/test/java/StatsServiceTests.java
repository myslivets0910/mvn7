import org.junit.jupiter.api.Test;
import ru.netology.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;
class StatsServiceTests {

    @Test
    void sumSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 180;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.sumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void avergSales( ) {
        StatsService service = new StatsService();
        // подготавливаем данные:
        double expected = 15;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        double actual = service.avergSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void minSales( ) {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 9;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void maxSales( ) {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 8;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void lessThanAvergSales( ) {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 7;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.lessThanAvergSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void aboveAvergSales( ) {
        StatsService service = new StatsService();
        // подготавливаем данные:
        int expected = 7;
        //long sales[] = new long[12];
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.aboveAvergSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}