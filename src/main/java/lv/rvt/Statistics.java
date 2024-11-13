package lv.rvt;

import java.util.ArrayList;

public class Statistics {

    ArrayList<Integer> list = new ArrayList<>();
    private int count;
    private int sum;

    public void addNumber(int number) {
        list.add(number);
    }

    public int getCount() {
        return list.size();
    }

    public int sum() {
        sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

    public double average() {
        return 1.0*sum/list.size();
    }
}
