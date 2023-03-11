
package Lesson_2;
// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
//результат после каждой итерации запишите в лог-файл.

import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;

public class Les2_t1 {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] nums = {9,8,7,6,5};
        boolean isSorted = false;
        int buf;
        while(!isSorted){
            isSorted = true;
            
            for (int i = 0; i < nums.length-1; i++) {
                
            
                if(nums[i] > nums[i+1]){
                    isSorted = false;

                    buf = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = buf;
                }
            }Logger logger = Logger.getLogger(Les2_t1.class.getName());
            logger.setLevel(Level.INFO);
            FileHandler fn = new FileHandler("log.txt");
            logger.addHandler(fn);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fn.setFormatter(sFormatter);
            logger.info(Arrays.toString(nums));
                
            } 
        }
    }

    

