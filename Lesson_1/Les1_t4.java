package Lesson_1;

import java.util.Scanner;


import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les1_t4 {
    public static void main(String[] args) {
        int el = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое значение");
        String q = iScanner.next();
        if (q.contains("?")){
            int index = q.indexOf("?");
            System.out.printf("Index символа ? " + index);
            if (index == 1){
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(q);
                int start = 0;
                while (matcher.find(start)) {
                    String value = q.substring(matcher.start(), matcher.end());
                    int result_1 = Integer.parseInt(value);
                    System.out.println("\n" + result_1);
                    start = matcher.end();
                    int result_11 = result_1 * 10;
        int z = result_11 + el;
                }
            }
            if  (index == 0){
                Pattern pattern_2 = Pattern.compile("\\d+");
                Matcher matcher_2 = pattern_2.matcher(q);
                int start_2 = 0;
                while (matcher_2.find(start_2)) {
                    String value_2 = q.substring(matcher_2.start(), matcher_2.end());
                    int result_2 = Integer.parseInt(value_2);
                    System.out.println("\n" + result_2);
                    start_2 = matcher_2.end();
                    int result_11 = result_2;
        int z = result_11 + el*10;
                    
                }
            }
        }   
        
         System.out.println("\n" + "Введите второе значение");
         String w = iScanner.next();
        if (w.contains("?")){
            int index_1 = w.indexOf("?");
            System.out.print("Index символа ? " + index_1);
            if (index_1 == 1){
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(w);
                int start = 0;
                while (matcher.find(start)) {
                    String value = w.substring(matcher.start(), matcher.end());
                    int result_1 = Integer.parseInt(value);
                    System.out.println("\n" + result_1);
                    start = matcher.end();
                    int result_12 = result_1 * 10;
        int x = result_12 + el;
                }
            }
            if  (index_1 == 0){
                Pattern pattern_2 = Pattern.compile("\\d+");
                Matcher matcher_2 = pattern_2.matcher(w);
                int start_2 = 0;
                while (matcher_2.find(start_2)) {
                    String value_2 = w.substring(matcher_2.start(), matcher_2.end());
                    int result_2 = Integer.parseInt(value_2);
                    System.out.println("\n" + result_2);
                    start_2 = matcher_2.end();
                    int result12 = result_2;
        int x = result12 + el*10;
                }
            }
            
                
        }
        System.out.println("\n" + "Введите сумму значений ");
        String e = iScanner.next();
        iScanner.close();
        System.out.printf("\n" + q + " + " + w + " = " + e);

       

        

            
        }
        
        
    
        
        
    
    }
}





    



    
