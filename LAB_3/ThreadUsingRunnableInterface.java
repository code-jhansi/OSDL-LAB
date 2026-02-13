class RoomCleaningTask implements Runnable{
    private String roomName;
    RoomCleaningTask(String roomName){
        this.roomName=roomName;
    }
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(roomName + " - Cleaning step" + i);
            try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted");
        }
        }
    }
}
public class ThreadUsingRunnableInterface {
    public static void main(String[] args){
        //creating runnable objects
        RoomCleaningTask task1=new RoomCleaningTask("{Room 201");
        RoomCleaningTask task2=new RoomCleaningTask("Room 202");
        //creating thread objects
        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        
        t1.start();
        t2.start();
    }    
}

// When a class extends Thread, it cannot extend any other class
// because Java supports single inheritance.
// When a class implements Runnable, it can still extend another class.
