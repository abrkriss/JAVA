package Lesson6;

import java.util.*;


public class Laptop_funks {
    private Set <Laptop> laptops = new HashSet<>();
    private List<Options> optionList = new ArrayList<>();
    private static Scanner iScanner = new Scanner(System.in);

    public void printList(){
        for(Laptop laptop : laptops){
            if(laptipIsOk(laptop)){
                System.out.println(laptop);
            }
        }
    }

    public boolean laptipIsOk(Laptop laptop){

        for (Options options : optionList){
            Object valLaptop = null;

            if(options.property.equals("ID")){
                valLaptop = laptop.getID();
            }
            else if (options.property.equals("model")){
                valLaptop = laptop.getModel();
            }
            else if(options.property.equals("OperSys")){
                valLaptop = laptop.getOperSys();
            }
            else if (options.property.equals("RAM")){
                valLaptop = laptop.getRAM();
            }
            else if (options.property.equals("price")){
                valLaptop = laptop.getPrice();
            }
            else {
                continue;
            }

            if (options.value != null && !options.value.equals((valLaptop))){
                return false;
            }

            if (options.Max != null && options.Max < Double.parseDouble(Objects.toString(valLaptop)));{
            }

            if (options.Min != null && options.Min < Double.parseDouble(Objects.toString(valLaptop))){
                return false;
            }
        }

        return true;
    }

    public Laptop_funks(Set<Laptop> laptops){
        this.iScanner = new Scanner(System.in);
        this.laptops = laptops;
    }

    public Laptop_funks(Set<Laptop> laptops, List<Options> optionList){
        this.iScanner = new Scanner(System.in);
        this.laptops = laptops;
        this.optionList = optionList;
    }

    public int GetOpt(){
        String t = "Введите цифру, соответствующую необходимому критерию: ";

        List <String> properties = FilterProp();
        for (int i = 0; i < properties.size(); i++) {
            t += "\n" + (i + 1) + ". " + getPropertyDescription(properties.get(i));
        }
        System.out.println(t);
        int value = iScanner.nextInt();
        return value;
    }

    public String getPropertyDescription(String property){

        Map<String, String> descriptionsProperties = descriptionsProperties();

        return descriptionsProperties.get(property);

    }

    public Map<String, String> descriptionsProperties(){
        Map<String, String> map = new HashMap<>();

        map.put("Id", "ID");
        map.put("model", "модель");
        map.put("OperSys", "Операционная система");
        map.put("RAM", "Объем оперативной памяти");
         map.put("price", "цена");

        return map;
    }

    public List<String> FilterProp(){
        List<String> list = new ArrayList<>();
        list.add("Id");
        list.add("model");
        list.add("OperSys");
        list.add("RAM");
        list.add("price");

        return list;
    }

    public String getOper(){
        String text = "Выберите опрерацию: \n " +
                "1. Добавить критерий \n " +
                "2. Вывести список \n " +
                "3. Завершить";

        System.out.println(text);
        String answ = iScanner.next();
        return answ;
    }

    public Set<String> quantitativeSelection(){
        Set<String> set = new HashSet<>();
        set.add("RAM");
        set.add("price");

        return set;
    }

    public Set<String> stringSelection(){
        Set<String> set = new HashSet<>();

        set.add("ID");
        set.add("model");
        set.add("OperSys");

        return set;
    }

    public void start() {

        boolean flag = true;
        while(flag){
            String oper = getOper();
            if(oper.equals("3")){
                flag = false;
                iScanner.close();
                continue;
            }
            else if (oper.equals("1")){
                int option = GetOpt();
                List<String> propert = FilterProp();
                if (option - 1 <0|| option -1 >propert.size()-1){
                    System.out.println("Введено некорректное значение");
                    continue;
                }
                String proper = propert.get(option - 1);
                Options optionObj = null;
                try{
                    if(quantitativeSelection().contains(proper)){
                        optionObj = Options.GetStart(iScanner, proper, true);
                    }
                    else{
                        optionObj = Options.GetStart(iScanner, proper, false);
                    }
                }
                catch(Exception e){
                    System.out.println("Ошибка при выборе критерия");
                    continue;
                }
                if(optionObj!= null){
                    System.out.println("Критерий добавлен");
                    optionList.add(optionObj);
                }
            }
            else if (oper.equals("2")){
                printList();
            }
        }
        
    }

    
}






class Options{
    Object value;
    Double Min;
    Double Max;
    String property;
    boolean isQuantit;

    public Options( Object value,Double Min,Double Max, String property,boolean isQuantit){
        this.value = value;
        this.Min = Min;
        this.Max = Max;
        this.property = property;
        this.isQuantit = isQuantit;
    }


    public static Options GetStart(Scanner iScanner, String property, boolean isQuantit){
        if (isQuantit){
            String scan = "Выберите тип криетрия: " +
            "\n 1. Значение" +
            "\n 2. Меньше" +
            "\n 3. Больше" +
            "\n 4. Интервал";
            System.err.println(scan);
            String text = iScanner.next();
            Options option = null;

            if(text.equals("1")){
                System.out.println("Введите значение поиска:");
                Integer getValue = iScanner.nextInt();
                option = new Options(getValue, null, null, property, isQuantit);
            }
            else if(text.equals("2")){
                System.out.println("Введите максимальное предельное значение: ");
                double getValue = iScanner.nextDouble();
                option = new Options(option, null, getValue, property, isQuantit);
            }
            else if (text.equals("3")) {
                System.out.println("Введите минимальное предельное значение: ");
                double getValue = iScanner.nextDouble();
                option = new Options(option, getValue, null, property, isQuantit);
            } 
            else if (text.equals("4")) {
                System.out.println("Введите минимальное предельное значение: ");
                double getMin = iScanner.nextDouble();
                System.out.println("Введите максимальное предельное значение: ");
                double getMax = iScanner.nextDouble();
                option = new Options(option, getMin, getMax, property, isQuantit);
            }
            return option;
        }
        System.out.println("Введите значение для поиска: ");
        String getValue = iScanner.next();
        return new Options(getValue, null, null, property, isQuantit);
    }
}

