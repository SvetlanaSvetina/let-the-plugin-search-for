package ru.netology.plagin.sqr;

public class PlaginService {
    // 1. Сумму всех продаж
    public int summService(int[] sales) {
        int summ = 0;
        for (int i = 0; i < sales.length; i++) {
            summ += sales[i];
        }
        return summ;
    }

    // 2. Средняя сумма продаж в месяц
    public int middleMonthSale(int[] sales) {
        int midInMonth = summService(sales) / sales.length;
        return midInMonth;
    }

    // 3. Номер месяца, в котором был пик продаж
    public int maxMonthSales(int[] sales) {
        int maxMonth = 1;
        int month = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= month) {
                month = sales[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }

    // 4. Номер месяца, в котором был минимум продаж
    public int minMonthSales(int[] sales) {
        int minMontn = 1;
        int month = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= month) {
                month = sales[i];
                minMontn = i + 1;
            }
        }
        return minMontn;
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    public int monthsAmountSalesLowerAverage(int[] sales) {
        int monthsAmount = 0;
        int sum =0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        for (int monthSale : sales) {
            if (monthSale < middleMonthSale(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }
    // 6. Кол-во месяцев, в которых продажи были выше среднего
    public int monthsAmountSalesAboveAverage(int[] sales) {
        int monthsAmount = 0;
        int sum =0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        for (int monthSale : sales) {
            if (monthSale > middleMonthSale(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

}

