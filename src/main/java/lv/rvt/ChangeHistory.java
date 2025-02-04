package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double max = 0;
        if (this.history.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i <= history.size(); i++) {
                if (max < history.get(i)) {
                    max = history.get(i);
                }
            }
            return max;
        }
    }

    public double minValue() {
        double min = 0;
        if (this.history.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i <= history.size(); i++) {
                if (min > history.get(i)) {
                    min = history.get(i);
                }
            }
            return min;
        }
    }

    public double average() {
        double avg = 0;
        if (this.history.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i <= history.size(); i++) {
                avg =+ history.get(i);
            }
            return avg/history.size();
        }

    }

    public String toString() {
        return history.toString();
    }
}
