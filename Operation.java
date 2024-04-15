import java.util.ArrayList;

public class Operation {

    private ArrayList<Task> taskList;


    public void createTask(String title,String description){
       try {
        Task obj = new Task(title, description);
        taskList.add(obj);
        
       } catch (Exception e) {
            throw new Error("Task Not Created"+ e.getMessage());
       }
    }

    public ArrayList<Task> getTaskArray(){
        return taskList;
    }
}