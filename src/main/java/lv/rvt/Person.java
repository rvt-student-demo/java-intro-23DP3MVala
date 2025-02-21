package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private String adress;

    public Person(String name, int age, int weight, int height, String adress) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return name + ", " + age + " years, " + weight + ", " + height + ", " + adress;
    }
}

