package com.company;

public abstract class Wallet {



    public abstract double currentState() ;
    public abstract double addMoney(double money, MoneyType moneyType1) ;
    public abstract double  removeMoney(double money , MoneyType moneyType1);

    public MoneyType moneyType;

    @Override
    public String toString() {
        return "Wallet{" + currentState()*100 + " " +MoneyType.GR + " / "
                + currentState()+ " " + MoneyType.PLN + " / " +
                currentState()/1000 + " " + MoneyType.KILO +
                '}';
    }
}
