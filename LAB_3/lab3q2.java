/*Design and implement a Java application to simulate an Online Order 
Processing System where multiple customer orders are processed simultaneously 
using multithreading.
1.*/
class OrderTask implements Runnable{
    private String taskName;
    public OrderTask(String taskName){
        this.taskName=taskName;
    }
    public void run(){
        try{
            System.out.println(taskName + " started...");
            //simulating process steps
            for(int i=1;i<=3;i++){
                System.out.println(taskName + " processing step " + i);
                Thread.sleep(5000);//simulate time delay
            }
            System.out.println(taskName + " completed.");
            }catch(InterruptedException e){
                System.out.println(taskName + " interrupted.");
            }
        }
}


public class lab3q2 {
    public static void main(String[] args){
        //Creating threads for different order-related tasks
        Thread validation = new Thread(new OrderTask("Order Validation"));
        Thread payment = new Thread(new OrderTask("Payment Processing"));
        Thread shipment = new Thread(new OrderTask("order Shipment"));

        //start all threads concurrently
        validation.start();
        payment.start();
        shipment.start();
        System.out.println("All order tasks are being processed concurrently...");
    }
}
