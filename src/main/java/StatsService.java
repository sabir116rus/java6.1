public class StatsService {
    public static long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static long average(long[] sales) {
        return sum(sales) / 12;
    }

    public static int maxSales(long[] sales) {
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

    public static int minSales(long[] sales) {
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

    public static int belowAverage(long[] sales) {
        long ave = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < ave) {
                count++;
            }
        }
        return count;
    }

    public static int aboveAverage(long[] sales) {
        long ave = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > ave) {
                count++;
            }
        }
        return count;
    }
}
