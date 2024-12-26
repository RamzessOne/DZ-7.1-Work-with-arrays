package app;

import java.util.Arrays;

public class Main {
    static double[] numsArr;
    static double negativeNumsSum;
    static int evenNumsCount;
    static int oddNumsCount;
    static double minNum;
    static double maxNum;
    static int maxIndex;
    static int minIndex;
    static boolean isNumNegative;
    static double numsSum;
    static double numsCount;
    static double averageVal;

    public static void main(String[] args) {

        numsArr = new double[]{-95, 20, -30, 10, -5, -77, 8, 91, 11, -77, 4, 88, -44, 55, 31, -33,
                0, 17, -36, 99};

        System.out.println("\n1) Element array: " + Arrays.toString(numsArr));

        for (double num : numsArr) {
            if (num < 0) {
                negativeNumsSum += num;
            }
            if (num % 2 == 0) { evenNumsCount++; }
            else { oddNumsCount++; }
        }
        System.out.println("\n2) Negative numbers sum is " + negativeNumsSum +
                "\n3) Even numbers sum is " + evenNumsCount + "\n4) Odd numbers sum is " +
                oddNumsCount);

        minNum = numsArr[0];
        maxNum = numsArr[0];

        for (int i = 0; i < numsArr.length; i++) {
            if (numsArr[i] < minNum) {
                minNum = numsArr[i];
                minIndex = i;
            }
            if (numsArr[i] > maxNum) {
                maxNum = numsArr[i];
                maxIndex = i;
            }
        }

        System.out.println("\n5) Min number is " + minNum + " (index: " + minIndex + ")" +
                "\n6) Max number is " + maxNum + " (index: " + maxIndex + ")");

        for (double v : numsArr) {
            if (isNumNegative) {
                numsSum += v;
                numsCount++;
            } else if (v > 0) {
                isNumNegative = true;
            }
        }
        if (numsCount > 0) {
            averageVal = numsSum / numsCount;
            System.out.println("\n7) Average value after the first negative number is" +
                      " " + averageVal);

        } else System.out.println("There are no negative numbers");
    }
}