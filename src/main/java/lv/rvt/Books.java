package lv.rvt;

import java.util.ArrayList;

public class Books {

    ArrayList<String> bookName = new ArrayList<>();
    ArrayList<Integer> pages = new ArrayList<>();
    ArrayList<Integer> year = new ArrayList<>();
    
    int skaits = bookName.size();
    int sk = 0;


    public void addNew(String name, int page, int years) {
        
        bookName.add(name);
        pages.add(page);
        year.add(years);
    }

    public void Everything() {
        for ( ; sk <= skaits; sk++) {
            System.out.print(bookName.get(sk) + ", ");
            System.out.print(pages.get(sk) + " pages, ");
            System.out.println(year.get(sk));
        }
    }

    public void onlyName() {
        for ( ; sk <= skaits; sk++) {
            System.out.println(bookName.get(sk));
        }
    }

}
