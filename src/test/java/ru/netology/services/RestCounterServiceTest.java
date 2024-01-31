package ru.netology.services;
/*import ru.netology.services.RestCounterService;*/
/*import org.junit.jupiter.api.Test;*/
/*import org.junit.jupiter.api.Assertions;*/

public class RestCounterServiceTest {
    /*@Test*/
    void countMonth() {

        RestCounterService service = new RestCounterService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int money = 0; // количество денег на счету
        int takeRest =  money - expenses - ((money - expenses) / 3);
        long expected = 3;

        //long rest = service.calculate(money, income, expenses, takeRest, threshold);

        /*Assertions.assertEquals(expected, rest);*/
    }
}