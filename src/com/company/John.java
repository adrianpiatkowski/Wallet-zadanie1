package com.company;

import java.util.Scanner;

public class John extends Wallet {
    private double money;
    Scanner scanner = new Scanner(System.in);
    String typKasy;

    public John(double money) {
//        moneyType = MoneyType.PLN;
        this.money = money;
    }

    @Override
    public double currentState() {
        return money;
    }

    @Override
    public double addMoney(double money, MoneyType moneyType1) {

        System.out.println("How much money to deposit  in :" + moneyType1 + " ?");
        money = scanner.nextDouble();
        if (moneyType1 == MoneyType.GR){
           return this.money += money * 0.01;
        }
        if (moneyType1 == MoneyType.PLN){
           return this.money += money;
        }
        if (moneyType1 == MoneyType.KILO){
           return this.money += money *1000;
        }
        else return 0;

    }

    @Override
    public double removeMoney(double money , MoneyType moneyType1) {

        System.out.println("How much money to withdraw in :" + moneyType1 + " ?");
        money = scanner.nextDouble();
        if (moneyType1 == MoneyType.GR){
            return this.money -= money * 0.01;
        }
        if (moneyType1 == MoneyType.PLN){
            return this.money -= money;
        }
        if (moneyType1 == MoneyType.KILO){
            return this.money -= money *1000;
        }
        else return 0;
    }


}
