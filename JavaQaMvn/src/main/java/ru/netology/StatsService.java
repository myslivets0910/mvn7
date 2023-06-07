package ru.netology;

/*Cтатистика — очень важный компонент любого бизнеса. У вас есть набор данных о продажах конкретного предприятия по месяцам: [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18].

Программисты все заняты, и вам поручили написать небольшой сервис, который умеет по предоставленному ему массиву месячных продаж рассчитывать:

сумму всех продаж;
среднюю сумму продаж в месяц;
номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
количество месяцев, в которых продажи были ниже среднего (см. п.2);
количество месяцев, в которых продажи были выше среднего (см. п.2).
*/
public class StatsService {
    public int sumSales(long[] sales) {  //сумму всех продаж;
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;

        }
        return sumMonth;
    }

    public double avergSales(long[] sales) { //среднюю сумму продаж в месяц;
        double avergSum = 0;
        double sumMonth = 0;

        sumMonth = sumSales(sales);
        avergSum = sumMonth / sales.length;

        return avergSum;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int index = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = index;
            }
            index = index + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int index = 0; // переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = index;
            }
            index = index + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int lessThanAvergSales(long[] sales) {
        int lessAvergMonth = 0;
        double avergSum = avergSales(sales);

        for (long sale : sales) {
            if (sale <= avergSum) {
                lessAvergMonth++;
            }
        }
        return lessAvergMonth;
    }

    public int aboveAvergSales(long[] sales) {
        int aboveAvergMonth = 0;
        double avergSum = avergSales(sales);

        for (long sale : sales) {
            if (sale >= avergSum) {
                aboveAvergMonth++;
            }
        }
        return aboveAvergMonth;
    }
}
