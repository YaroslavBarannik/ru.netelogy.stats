package ru.netelogy.stats;

public class StatsService {
    public long totalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales = totalSales + sale;
        }
        return totalSales;
    }

    public int minSales(long[] sales) {

        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long avgSales(long[] sales) {
        int monthNum = sales.length;

        long avgSales = totalSales(sales) / monthNum;

        return avgSales;
    }

    public int monthsBelowAvg(long[] sales) {
        int monthsBelowAvg = 0;
        for (long sale : sales) {
            if (sale <= avgSales(sales)) {
                monthsBelowAvg = monthsBelowAvg + 1;
            }
        }
        return monthsBelowAvg;
    }


    public int monthsAboveAvg(long[] sales) {
        int monthsAboveAvg = 0;
        for (long sale : sales) {
            if (sale > avgSales(sales)) {
                monthsAboveAvg = monthsAboveAvg + 1;
            }
        }
        return monthsAboveAvg;
    }
}