enum RoomType{
    STANDARD(2000),
    DELUXE(3000),
    SUITE(5000);
    //Instance variable
    private float basetariff;
    RoomType(float basetariff){
        this.basetariff=basetariff;
    }
    //method to get base tariff
    public float getBaseTariff(){
        return basetariff;
    }
    public float calculateCost(int days){
        return basetariff*days;
    }
}


public class lab2q2 {
    public static void main(String[] args){
        RoomType room=RoomType.DELUXE;
        int days=3;
        System.out.println("Room Type: " + room);
        System.out.println("Base Tariff: " + room.getBaseTariff());
        System.out.println("Days Stayed: " + days);
        System.out.println("total Cost: " + room.calculateCost(days));
    }
    
}
