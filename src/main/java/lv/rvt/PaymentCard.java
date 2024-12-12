package lv.rvt;

import java.util.ArrayList;

public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        if (balance > amount) {
            this.balance = this.balance - amount;
            return true;
        }
        else {
            return false;
        }
    }
}
