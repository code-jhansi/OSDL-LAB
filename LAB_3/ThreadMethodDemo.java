// sleep() - pause thread
// join() - wait for another thread
// yield() - give chance to other threads
class BookingThread extends Thread{
    private String taskName;
    BookingThread(String taskName){
        this.taskName=taskName;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(taskName + " - Processing step " + i);
            //yield() gives chance to other threads
            Thread.yield();
            try{
                //sleep() pauses execution
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }

        }
     System.out.println(taskName  + "completed.");
    }

}
public class ThreadMethodDemo {
    public static void main(String[] args){
        BookingThread t1= new BookingThread("Room Booking");
        BookingThread t2=new BookingThread("Payment Processing");
        t1.start();
        try{
            //join() makes main thread wait until t1 completes
            t1.join();
        }catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
        //start second thread after t1 finishes
        t2.start();
        System.out.println("Main thread completed.");
    }    
}
