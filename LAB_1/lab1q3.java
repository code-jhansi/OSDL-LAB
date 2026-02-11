/*Design and implement a Java application to simulate a Hotel Room Booking System 
that demonstrates the object-oriented concepts of inheritance and runtime 
polymorphism.*/
/*1.Create a base class named Room that represents a general hotel room. The class should 
contain data members such as room number and base tariff, and a method 
calculateTariff() to compute the room cost.
2.Create derived classes such as StandardRoom and LuxuryRoom that inherit from the 
Room class. Each derived class should override the calculateTariff() method to 
compute the tariff based on room-specific features such as air conditioning, additional 
amenities, or premium services.
3.In the main class, create a base class reference of type Room and assign it to objects of 
different derived classes (StandardRoom, LuxuryRoom). Invoke the 
calculateTariff() method using the base class reference to demonstrate runtime 
polymorphism, where the method call is resolved at runtime based on the actual 
object type. */



//Base class
class Room{
    int roomnumber;
    float tariff;
    Room(int roomnumber,float tariff){
        this.roomnumber=roomnumber;
        this.tariff=tariff;
    }
    void calculateTariff(){
        System.out.println("Base Tariff: " + tariff);
    }
}
//Derived class - StandardRoom
class standardRoom extends Room{
    standardRoom(int roomnumber,float tariff){
        super(roomnumber,tariff);
    }
    void calculateTariff(){
        float total = tariff+500; //AC Charges
        System.out.println("Standard Room Tariff: " + total);
    }
}
//Derived class - LuxuryRoom
class luxuryRoom extends Room{
    luxuryRoom(int roomnumber,float tariff){
        super(roomnumber,tariff);
    }
    void calculateTariff(){
        float total=tariff+1500; //premium services
        System.out.println("Luxury Room Tariff: " + total);
    }
}
public class lab1q3 {
    public static void main(String[] args){
        Room r;
        r=new standardRoom(101,2000);
        r.calculateTariff();
        r=new luxuryRoom(201,3000);
        r.calculateTariff();
    }    
}
/*Polymorphism occurs when the base class reference Room r refers to 
different subclass objects (StandardRoom, LuxuryRoom) and the 
overridden calculateTariff() method is invoked based on object type at runtime.*/