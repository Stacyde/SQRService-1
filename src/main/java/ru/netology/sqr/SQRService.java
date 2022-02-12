package ru.netology.sqr;

public class SQRService {

    public int calculateNumberOfSquares(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= a) & (i * i <= b)) {
                count += 1;
            }
        }
        System.out.println(count);
        return count;
    }
}

