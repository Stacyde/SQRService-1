package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldCalculateSqrt(){
        SQRService service = new SQRService();
        int a = 200;
        int b = 300;
        int expected = 3;

        int actual = service.calculateSqrt(a, b);

        assertEquals(expected, actual);

    }
    @Test
    public void shouldCalculateSqrt1(){
        SQRService service = new SQRService();
        int a = 100;
        int b = 200;
        int expected = 5;

        int actual = service.calculateSqrt(a, b);

        assertEquals(expected, actual);

    }

}