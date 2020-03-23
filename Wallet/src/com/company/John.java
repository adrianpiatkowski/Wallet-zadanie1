package com.company;

import java.util.Scanner;

public class John extends Wallet {
    private double money;
    Scanner scanner = new Scanner(System.in);
    String typKasy;

    public John(double money) {
        moneyType = MoneyType.PLN;
        this.money = money;
    }

    @Override
    public double currentState() {
        return money ;
    }

    @Override
    public double addMoney(double money) {
        return this.money+=money;
    }

    @Override
    public double removeMoney(double money) {
        return this.money-=money;
    }

    @Override
    public MoneyType exChangeToUSD() {
        if (moneyType == MoneyType.EUR){
            money= money*4/3;
        }
        else if (moneyType == MoneyType.PLN){
            money = money*3;
        }
        return moneyType = MoneyType.USD;
    }

    @Override
    public MoneyType exChangeToPLN() {
        if (moneyType == MoneyType.EUR){
            money= money*4;
        }
        else if (moneyType == MoneyType.USD){
            money = money*3;
        }
        return moneyType = MoneyType.PLN;
    }

    @Override
    public MoneyType exChangeToEUR() {
        if (moneyType == MoneyType.PLN){
            money= money/4;
        }
        else if (moneyType == MoneyType.USD){
            money = money*3/4;
        }
        return moneyType = MoneyType.EUR;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public MoneyType currentMoneyType() {
        return moneyType;
    }

    //    @Override
//    public double addMoney(double money, MoneyType moneyType1) {
//
//        System.out.println("How much money to deposit  in :" + moneyType1 + " ?");
//        money = scanner.nextDouble();
//        if (moneyType1 == MoneyType.GR){
//           return this.money += money * 0.01;
//        }
//        if (moneyType1 == MoneyType.PLN){
//           return this.money += money;
//        }
//        if (moneyType1 == MoneyType.KILO){
//           return this.money += money *1000;
//        }
//        else return 0;
//
//    }
//
//    @Override
//    public double removeMoney(double money , MoneyType moneyType1) {
//
//        System.out.println("How much money to withdraw in :" + moneyType1 + " ?");
//        money = scanner.nextDouble();
//        if (moneyType1 == MoneyType.GR){
//            return this.money -= money * 0.01;
//        }
//        if (moneyType1 == MoneyType.PLN){
//            return this.money -= money;
//        }
//        if (moneyType1 == MoneyType.KILO){
//            return this.money -= money *1000;
//        }
//        else return 0;
//    }


}
