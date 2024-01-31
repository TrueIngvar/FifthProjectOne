package ru.netology.services;

public class RestCounterService {
    public static void main(String[] args) {
        /*public int calculate(int money, int income, int expenses, int threshold, int takeRest) {*/
            int count = 0; // счётчик месяцев отдыха
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int money = 0; // количество денег на счету
        //int takeRest =  money - expenses - ((income - expenses) / 3);
            for (int month = 1; month <= 12; month++) {
                if (money >= threshold) { // можем ли отдыхать?
                    count++; // увеличиваем счётчик месяцев отдыха
                    int takeRest = (money - expenses) - ((money - expenses) / 3);
                    System.out.println("Месяц " + month + ". " + "Денег " + money + ". " + "Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + takeRest);
                    money = money - expenses - takeRest;
                } else {
                    System.out.println("Месяц " + month + ". " + "Денег " + money + ". " + "Придётся работать. " + "Заработал +" + income + ", потратил -" + expenses);
                    money = money + income - expenses;
                }
            }
            //return count;
        }
    }
/*}*/