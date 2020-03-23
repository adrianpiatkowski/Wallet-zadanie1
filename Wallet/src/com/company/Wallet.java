package com.company;

public abstract class Wallet {



    public abstract double currentState() ;
    public abstract double addMoney(double money) ;
    public abstract double  removeMoney(double money);
    public abstract MoneyType exChangeToUSD();
    public abstract MoneyType exChangeToPLN();
    public abstract MoneyType exChangeToEUR();
    public abstract MoneyType currentMoneyType();

    public MoneyType moneyType;

    @Override
    public String toString() {
        return "Wallet{" +
                "moneyType=" + moneyType +
                '}';
    }
}
