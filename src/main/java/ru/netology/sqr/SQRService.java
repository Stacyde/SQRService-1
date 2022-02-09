package ru.netology.sqr;

public class SQRService {

    public int calculateSqrt(int a, int b) {
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= a) & (i * i <= b)) {
                sum += 1;
            }
        }
        System.out.println(sum);
        return sum;
    }
}

