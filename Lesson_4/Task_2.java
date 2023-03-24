import java.util.LinkedList;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Task_2{
   static LinkedList list = new LinkedList<>();
   public static void main(String[] args) {
     Task_2.enqueue("8");
     Task_2.enqueue("22");
     Task_2.enqueue("35");
     Task_2.first(list);
     Task_2.dequeue(list);
  
   }
   public static void enqueue(String e){
      list.addLast(e);
      System.out.println("Добавлен элемент: " + e);
      System.out.println(list);
   }
   public static void dequeue(LinkedList e){
      list.removeFirst();
      System.out.println("Список после удаления первого элемента: " + list);
   }
   public static void first(LinkedList e){
      System.out.println("Первый элемент " + list.getFirst());
   }
    
}