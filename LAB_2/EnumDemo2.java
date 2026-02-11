enum RoomType{
    STANDARD(2000),
    DELUXE(3500),
    SUITE(5000);
    //instance variable
    private int pricePerNight;
    //Enum Constructor
    RoomType(int pricePerNight){
        this.pricePerNight=pricePerNight;
    }
    //Getter method
    public int getPricePerNight(){
        return pricePerNight;
    }
    //Method to calculate total cost
    public int calculateCost(int nights){
        return pricePerNight*nights;
    }
}
public class EnumDemo2 {
    public static void main(String[] args){
        RoomType room=RoomType.DELUXE;
        int nights=3;
        System.out.println("Room Type :" + room);
        System.out.println("Price Per Night:"+ room.getPricePerNight());
        System.out.println("Number of Nights:"+ nights);
        System.out.println("Total Cost:"+ room.calculateCost(nights));

    }
    
}