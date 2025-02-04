package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            if (amount > howMuchSpaceLeft()) {
                this.balance = capacity;
            } else {
                this.balance = balance + amount;
            }
        } else {
            return;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount > 0) {
            this.balance = this.balance - amount;
            return amount;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return "balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
}
