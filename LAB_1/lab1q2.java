/*Create a base class named Room to represent general room details in a hotel. The 
class should contain data members such as room number, room type, and base 
price. Implement multiple constructors (constructor overloading) in the Room 
class to initialize room objects in different ways, such as: */


/*
1.Initializing only the room number and type.
2.Initializing room number, type, and base price.
3.Create a derived class named DeluxeRoom that inherits from the Room class 
using single inheritance. The derived class should include additional data 
members such as free Wi-Fi availability and complimentary breakfast. 
Implement appropriate constructors in the derived class that invoke the base 
class constructors using the super keyword.
4. Create a main class to instantiate objects of both Room and DeluxeRoom using 
different constructors and display the room details. This application should 
clearly illustrate constructor overloading and inheritance.
*/
class Room{
    int roomnumber;
    String roomtype;
    float baseprice;

        Room(int roomnumber,String roomtype,float baseprice){
            this.roomnumber=roomnumber;
            this.roomtype=roomtype;
            this.baseprice=baseprice;
        }
        Room(int roomnumber,String roomtype){
            this.roomnumber=roomnumber;
            this.roomtype=roomtype;
            this.baseprice=0;
        }
        void display(){
            System.out.println("Room Number: " + roomnumber);
            System.out.println("Room Type: " + roomtype);
            System.out.println("Base Price: " + baseprice);
        }
    
    }
//Derived class
class DeluxeRoom extends Room {
        String wifiavailability;
        String complimentarybf;
        DeluxeRoom(int roomnumber,String roomtype,float baseprice,String wifiavailability,String complimentarybf){
            super(roomnumber,roomtype,baseprice);
            this.wifiavailability=wifiavailability;
            this.complimentarybf=complimentarybf;
        }
        void displayDeluxe(){
            display();
            System.out.println("WiFi: " + wifiavailability);
            System.out.println("Breakfast: " +complimentarybf);
        }

    }
public class lab1q2{
    public static void main(String[] args){
        Room r1 = new Room(101,"standard");
        Room r2 = new Room(102,"AC",2500);
        DeluxeRoom d1=new DeluxeRoom(201,"Deluxe",4000,"Available","Included");
        System.out.println("--------ROOM-1---------");
        r1.display();
        System.out.println("\n--------ROOM-2----------");
        r2.display();
        System.out.println("\n------DELUXE ROOM-------");
        d1.display();
    }
}



