package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class Laptop {
    Integer id;
    String model;
    String OperSys;
    Integer RAM;
    Integer price;

    public Laptop(Integer id, String model, String OperSys, Integer RAM, Integer price){
        this.id = id;
        this.model = model;
        this.OperSys = OperSys;
        this.RAM = RAM;
        this.price = price;
    }

    public static List<String> FindFilter(){
        List<String> list = new ArrayList<>();
        list.add("model");
        list.add("OperSys");
        list.add("RAM");
        list.add("price");

        return list;
    }

    @Override
    public String toString() {
        return "Ноутбук: (" + id + "): " +
                "количество опретивной памяти:" + RAM +
                ", операционная система: " + OperSys + '\'' +
                ", цена: " + price +
                ", модель: " + model;
    }


    public Integer getID(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }


    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }


    public String getOperSys(){
        return OperSys;
    }
    public void setOperSys(String OperSys) {
        this.OperSys = OperSys;
    }


    public Integer getRAM(){
        return RAM;
    }
    public void setRAM(Integer RAM) {
        this.RAM = RAM; 
    }


    public Integer getPrice(){
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }



    
}
