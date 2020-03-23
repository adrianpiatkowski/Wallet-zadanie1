package com.company;


import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        John john = new John(200);
        double odczytanaIlosc=0;
        int przycisk=10;

        while (przycisk!=0){

            System.out.println("1 - Current account balance");
            System.out.println("2 - Deposit money");
            System.out.println("3 - Withdraw money");
            System.out.println("4 - Change currency");
            System.out.println("0 - Exit");
            przycisk = scanner.nextInt();
            switch (przycisk) {
                case 1:
                    System.out.println("Current balance: " + john.currentState() + " " + john.currentMoneyType());
                    break;
                case 2:
                    System.out.println("How much you want deposit?");
                    odczytanaIlosc = scanner.nextDouble();
                    john.addMoney(odczytanaIlosc);
                    System.out.println("Current balance: " + john.currentState() + " " + john.currentMoneyType());
                    break;
                case 3:
                    System.out.println("How much you want withdraw?");
                    odczytanaIlosc = scanner.nextDouble();
                    john.removeMoney(odczytanaIlosc);
                    System.out.println("Current balance: " + john.currentState() + " " + john.currentMoneyType());
                    break;
                case 4:
                    System.out.println("To which currency?");
                    System.out.println("0 - To PLN");
                    System.out.println("1 - To EUR");
                    System.out.println("2 - To USD");
                    int przyciskWalutowy = 5;
                    przyciskWalutowy = scanner.nextInt();
                    switch (przyciskWalutowy) {
                        case 0:
                            john.exChangeToPLN();
                            break;
                        case 1:
                            john.exChangeToEUR();
                            break;
                        case 2:
                            john.exChangeToUSD();
                            break;
                    }
                    System.out.println("Current balance: " + john.currentState() + " " + john.currentMoneyType());
                    break;
                case 0:
                    System.out.println("Wallet closed");
                    break;
            }
        }

    }


}
