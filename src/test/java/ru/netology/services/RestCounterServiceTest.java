package ru.netology.services;
//import ru.netology.services.RestCounterService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RestCounterServiceTest {
    @Test
    void countMonth() {

        RestCounterService service = new RestCounterService();
        long money = 0; // количество денег на счету
        long income = 100_000;
        long expenses = 60_000;
        long threshold = 150_000;
        //long takeRest = (money - expenses) - ((money - expenses) / 3);
        long expected = 2;


        long rest = service.calculate(money, income, expenses, threshold/*, takeRest*/);
        Assertions.assertEquals(expected, rest);
    }
}