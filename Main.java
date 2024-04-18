
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  n = 0;
        Scanner sc = new Scanner(System.in);
        Operation operation = new Operation();
        do {
           try {
            System.out.println("Enter Input");
            // System.err.println("Press 3 for update task");
            n = sc.nextInt();
           sc.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Enter Title");
                    String title = sc.nextLine();
                    System.out.println("Enter Description");
                    String description  = sc.nextLine();
                    operation.createTask(title, description);
                    System.out.println("Task Created");
                    break;

                case 2:
                    // to see all tasks that are created 
                    ArrayList<Task> tasks =  operation.getTaskArray();
                    System.out.println("Hello I am here");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(tasks.get(i).getTitle());
                        System.out.println(tasks.get(i).getDescription());
                    }
                    break;

                case 3:
                    System.out.println("Enter Title");
                    String title1 = sc.nextLine();

                    operation.updateTask(title1);
                    break;

                default:
                    break;
            }
            // int i;
            // Throwable is the last class which catch all error and exceptions and print them
           } catch (Throwable e) {
            // TODO: handle exception
           }
        } while (n!=9);
    }
}