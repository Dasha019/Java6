package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void calcTestInitial() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestLowerBound() {
        SQRService service = new SQRService();

        int actual = service.calc(226, 300);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestUpperBound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 288);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestBordering() {
        SQRService service = new SQRService();

        int actual = service.calc(226, 288);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}