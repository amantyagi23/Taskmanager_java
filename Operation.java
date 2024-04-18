import java.util.ArrayList;

public class Operation {

    private ArrayList<Task> taskList = new ArrayList<Task>();


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

    public boolean updateTask(String title){
        Task obj1 = searchTask(title);
        obj1.setTitle(title);
        obj1.setDescription(title);
        return false;
    }

    public boolean deleteTask(String title){
        Task obj = searchTask(title);
        taskList.remove(obj);
        return false;
    }

    private Task searchTask(String title){

        for (int i = 0; i < taskList.size(); i++) {
            if(taskList.get(i).getTitle().equals(title)){
                return taskList.get(i);
            }
        }
        
        throw new Error("Task Not Found");
    }
}