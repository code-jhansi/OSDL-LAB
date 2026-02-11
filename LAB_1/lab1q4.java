/*Create an abstract class named Room that represents a generic hotel room. The abstract 
class should contain common data members such as room number and base price, and 
include an abstract method calculateTariff() that must be implemented by all 
subclasses. It may also include concrete methods such as displayRoomDetails(). */
/*
1.Create derived classes such as StandardRoom and LuxuryRoom that extend the abstract 
Room class and provide concrete implementations for the calculateTariff() method 
based on room-specific features.
2.Create an interface named Amenities that declares methods such as provideWifi() 
and provideBreakfast(). The derived room classes should implement this interface to 
define the amenities offered for each room type.
3.Create a main class to instantiate different room objects using a base class reference and 
invoke the implemented methods to demonstrate abstraction and interface-based design. 
 */

//Abstract class
abstract class Room{
    int roomnumber;
    float baseprice;
    Room(int roomnumber,float baseprice){
        this.roomnumber=roomnumber;
        this.baseprice=baseprice;
    }
    //Abstract method - must be implemented by subclasses
    abstract void calculateTariff(); //abstract method has no body
    //Concrete method
    void displayRoomDetails(){
        System.out.println("Room Number: " + roomnumber);
        System.out.println("Base price: " + baseprice);
    }
}
//An interface defines methods that must be implemented by any class that implements it.
//It provides abstraction and supports multiple inheritance
interface Amenities{
    void provideWifi(); //interface methods are automatically public abstract 
    void provideBreakfast();//all methods inside must be implemented by subclass
}
//Standard Room inherting Room and implementing Amenities
class StandardRoom extends Room implements Amenities{
    StandardRoom(int roomnumber,float baseprice){
        super(roomnumber,baseprice);
    }
    //overriding abstract method from Room
    void calculateTariff(){
        float total = baseprice+1000;
        System.out.println("Standard Room:" +total);
    }
    //implementing interface methods
    public void provideWifi(){
        System.out.println("WiFi Available in Standard Room");
    }
    public void provideBreakfast(){
        System.out.println("Breakfast Included in Standard Room");
    }
}

class LuxuryRoom extends Room implements Amenities{
    LuxuryRoom(int roomnumber,float baseprice){
        super(roomnumber,baseprice);
    }
    void calculateTariff(){
        float total = baseprice+2000;
        System.out.println("Luxury Room:" +total);
    }
    public void provideWifi(){
        System.out.println("High Speed WiFi in luxury Room");
    }
    public void provideBreakfast(){
        System.out.println("Premium Breakfast Included");
    }
}
//Abstraction + Polymorphism + interface
public class lab1q4 {
    public static void main(String[] args){

        Room r;
        r=new StandardRoom(101,3000);
        r.displayRoomDetails();
        r.calculateTariff();

        //Casting room reference to Amenities interface
        //because Room doesnt have these methods
        Amenities a1=(Amenities) r;
        a1.provideWifi();
        a1.provideBreakfast();
        System.out.println();

        r=new LuxuryRoom(201,5000);
        r.displayRoomDetails();
        r.calculateTariff();

        Amenities a2=(Amenities) r;
        a2.provideWifi();
        a2.provideBreakfast();
        System.out.println();

    }    
}
