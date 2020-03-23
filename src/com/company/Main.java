package com.company;


import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        John john = new John(200);
        double odczytanaIlosc=0;


        System.out.println(john.currentState());
        System.out.println(john);
        john.addMoney(odczytanaIlosc, MoneyType.KILO);
        System.out.println(john);
        john.removeMoney(odczytanaIlosc, MoneyType.PLN);
        System.out.println(john);
    }


}
