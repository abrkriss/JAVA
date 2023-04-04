package Lesson6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Set<Laptop> laplist = new HashSet<>();
       laplist.add(new Laptop(001, "HP", "Linux", 8, 25000));
       laplist.add(new Laptop(002, "Samsung", "Windows", 8, 20000));
       laplist.add(new Laptop(003, "HP", "Windows", 16, 32000));
       laplist.add(new Laptop(004, "Samsung", "Linux", 16, 35000));
       laplist.add(new Laptop(005, "HP", "Windows", 4, 13000));
       laplist.add(new Laptop(006, "Samsung", "Linux", 4, 15000));
       Laptop_funks oper = new Laptop_funks(laplist);
       oper.start();

    }
    
}
