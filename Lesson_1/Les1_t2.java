package Lesson_1;
// Вывести все простые числа от 1 до 1000

public class Les1_t2 {
    public static void main(String[] args) {
        int num = 1000;
        for (int j = 2; j <= num; j++) {
            boolean aw = false;
            for (int i = 2; i * i <= j; i++) {
                aw = (j % i == 0);
                if (aw){
                    break;
                }
                
            }
            if(!aw){
                System.out.print(j + "\n");
            }
        }

    } 
}
