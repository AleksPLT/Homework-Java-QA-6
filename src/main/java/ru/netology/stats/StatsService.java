package ru.netology.stats;

public class StatsService {
    public long salesSum(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long averageSale(long[] sales) {
        return salesSum(sales) / sales.length;
    }

    public int maxSaleMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSaleMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;

    }

    public int monthsBellowAverage(long[] sales) {
        int quantity = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                quantity++;
            }
        }
        return quantity;
    }

    public int monthsAboveAverage(long[] sales) {
        int quantity = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                quantity++;
            }
        }
        return quantity;
    }

}




