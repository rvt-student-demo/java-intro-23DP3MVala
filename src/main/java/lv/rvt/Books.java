package lv.rvt;

import java.util.ArrayList;

public class Books {

    ArrayList<String> bookName = new ArrayList<>();
    ArrayList<Integer> pages = new ArrayList<>();
    ArrayList<Integer> year = new ArrayList<>();
    

    public void addNew(String name, int page, int years) {
        
        bookName.add(name);
        pages.add(page);
        year.add(years);
    }

    public static void Output() {
        System.out.println(2);
    }

}
