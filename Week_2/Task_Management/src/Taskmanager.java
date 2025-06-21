public class Taskmanager {
    private Task head;

    public void addtask(Task newTask ){
        if(head==null) head=newTask;
        else{
            Task current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newTask;
        }
    }
    public Task search(int taskId){
        Task current=head;
        while(current!=null){
            if(current.taskId==taskId) return current;
            current=current.next;
        }
        return null;
    }
    public void traversetask(){
        Task current=head;
        while(current!=null){
            System.out.println(current);
            current=current.next;
        }
    }

    public boolean deletetask(int taskId){
        if(head==null) return false;
        if(head.taskId==taskId){
            head=head.next;
            return true;
        }
        Task current=head;
        while(current.next!=null){
            if(current.next.taskId==taskId){
                current.next=current.next.next;
                return true;
            }
            current=current.next;
        }
        return false;
    }
}
