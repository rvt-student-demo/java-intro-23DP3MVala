package lv.rvt;

import java.util.ArrayList;

public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        while (true) {
            if (balance >= 2.6) {
                balance -= 2.6;
            }
            else {
                break;
            }
        }
    }
    
    public void eatHeartily() {
        while (true) {
            if (balance >= 4.6) {
                balance -= 4.6;
            }
            else {
                break;
            }
        }
    }

    public void addMoney(double amount) {
        while (true) {
            if (amount > 0) {
                if (balance+amount<=150 ) {
                    balance += amount;
                }
                else {
                    balance = 150;
                }
            }
            break;
        }
    }
}
