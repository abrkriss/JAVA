import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task_2 {
    public static void main(String[] args){
        // Пусть дан произвольный список целых чисел, удалить из него чётные числа

        ArrayList <Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,5,6,8,9,4,3));
        System.out.println(nums);
        Iterator <Integer> iter = nums.iterator();
        while(iter.hasNext()){
            if(iter.next()%2 == 0){
                iter.remove();
            }
        }
        System.out.println("Без чётных чисел " + nums);
    }
}
    

