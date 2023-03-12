package Lesson_2;
// Дана строка (получение через обычный текстовый файл!!!)

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
// .
public class Les2_t2 {
    public static void main(String[] args)throws Exception {
        try{
        FileReader fr = new FileReader("task2.txt");
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        
            while (line!= null){
                System.out.println(line);
                line = reader.readLine();  
            }
        }
            catch(FileNotFoundException e){
                e.printStackTrace();
        }   catch (IOException e){
                e.printStackTrace();
        }  
        
    }
    
   
}
