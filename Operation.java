public class Operation {
    public void createTask(String title,String description){
       try {
        Task obj = new Task(title, description);
       } catch (Exception e) {
            throw new Error("Task Not Created"+ e.getMessage());
       }
    }

    public void getAllTask(){
        
    }
}
