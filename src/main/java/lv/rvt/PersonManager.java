package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("personas.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            int weight = Integer.valueOf(parts[2]);
            int height = Integer.valueOf(parts[3]);
            String address = parts[4];

            Person person = new Person(name, age, weight, height, address);
            personList.add(person);
        }

        return personList;
    }

    public static void addPerson(Person person) throws Exception {
        BufferedWriter writer = Helper.getWriter(null, null)
    }
}
