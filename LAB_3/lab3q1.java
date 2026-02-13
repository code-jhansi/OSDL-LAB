/*Design and implement a Java application to simulate a Hotel Room Service 
Management System where multiple service requests are handled concurrently 
using multithreading.
1.In a hotel, different room service tasks such as room cleaning, food delivery, and 
maintenance may occur at the same time. To efficiently manage these tasks, the 
application should create separate threads for each service request so that they can 
execute concurrently rather than sequentially.
2.Create individual threads for different service operations using Java thread creation 
techniques (Thread class or Runnable interface). Each thread should simulate a service 
task by displaying status messages and pausing execution using the sleep() method to 
represent processing time.
3.The main program should start multiple threads simultaneously and demonstrate 
concurrent execution of hotel service tasks.*/



class ServiceTask implements Runnable{
    private String serviceName;
    public ServiceTask(String serviceName){
        this.serviceName=serviceName;
    }
    public void run(){
        try{
            System.out.println(serviceName + " started...");
            //simulate service procesing time
            for(int i=1;i<=3;i++){
                System.out.println(serviceName + " in progress step " + i);
                Thread.sleep(5000); //pause for 1 second
            }
            System.out.println(serviceName + " completed.");
        }catch(InterruptedException e){
            System.out.println(serviceName + " interrupted.");
        }
    }
}
public class lab3q1 {
    public static void main(String[] args){
        Thread cleaning = new Thread(new ServiceTask("Room Cleaning"));
        Thread foodDelivery = new Thread(new ServiceTask("Food Delivery"));
        Thread maintenance = new Thread(new ServiceTask("Maintenance Service"));

        //start all thread concurrently
        cleaning.start();
        foodDelivery.start();
        maintenance.start();
        System.out.println("All service requests are being processed...");
    }
}
