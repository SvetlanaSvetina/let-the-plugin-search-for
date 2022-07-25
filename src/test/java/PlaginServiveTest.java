import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;
import ru.netology.plagin.sqr.PlaginService;

class PlaginServiceTest {
    @Test // 1. Сумму всех продаж
    public void totalOfAllSales() {
        PlaginService service = new PlaginService(); // создаем наш сервис
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // заводим переменную и вводим значения

        int expectedSumm = 180;
        int actualSum = service.summService(sales);

        Assertions.assertEquals(expectedSumm, actualSum);
    }

    @Test // 2. Средняя сумма продаж в месяц
    public void middleOfSales() {
        PlaginService service = new PlaginService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualMidSum = service.middleMonthSale(sales);

        Assertions.assertEquals(expectedSum, actualMidSum);
    }

    @Test  // 3. Номер месяца, в котором был пик продаж
    public void maxOfSales() {
        PlaginService service = new PlaginService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMaxSale = service.maxMonthSales(sales);

        Assertions.assertEquals(expectedMax, actualMaxSale);
    }

    @Test  // 4. Номер месяца, в котором был минимум продаж
    public void minOfSales() {
        PlaginService service = new PlaginService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 9;
        int actualMinSale = service.minMonthSales(sales);

        Assertions.assertEquals(expectedMin, actualMinSale);
    }

    @Test  // 5. Кол-во месяцев, в которых продажи были ниже среднего
    public void monthsAmountSalesLowerAverage() {
        PlaginService service = new PlaginService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthsAmountSalesLowerAverage(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test   // 6. Кол-во месяцев, в которых продажи были выше среднего
    public void monthsAmountSalesAboveAverage() {
        PlaginService service = new PlaginService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthsAmountSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}

