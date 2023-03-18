import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tack_3{
    private static double average(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
}
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList. 
        // Найти минимальное, максимальное и среднее ариф. из этого списка.
        ArrayList <Integer> list = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        double av = average(list);
        System.out.println(av);     

        
}
}
