package lv.rvt;

public class HealthStation {
    int weightin;

    public int weigh(Person person) {
        weightin++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return weightin;
    }
}
