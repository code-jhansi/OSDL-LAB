//Creating a thread class by extending Thread
class RoomCleaningThread extends Thread{
    private String roomName;

    RoomCleaningThread(String roomName){
        this.roomName=roomName;
    }
    //run() method contains the task of the thread
    //It executes when start() method is called
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(roomName + " - Cleaning step " + i);
            try{
                //pause thread for 500 milliseconds
                //simulate time taken to clean
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                //handles interruption exception
                System.out.println("Thread Interrupted");
            }
        }

    }
}
public class ThreadUsingThreadClass {
    public static void main(String[] args){
        RoomCleaningThread t1=new RoomCleaningThread("Room 101");
        RoomCleaningThread t2=new RoomCleaningThread("Room 102");
        //start() begins execution of thread.
        //internally calls run() method.
        t1.start();
        t2.start();
    }    
}
