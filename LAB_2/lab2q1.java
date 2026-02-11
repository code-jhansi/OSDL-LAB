/*The Hotel Billing system should calculate the total bill amount for hotel guests based on 
room charges and additional service charges. Store numeric values such as room tariff, 
number of days stayed, and service charges using wrapper class objects (Integer, 
Double) instead of primitive data types.
Demonstrate autoboxing by automatically converting primitive values to wrapper class 
objects when assigning values or storing them in collections. Demonstrate unboxing by 
automatically converting wrapper class objects back to primitive types while performing 
arithmetic operations for bill calculation.
Create a main class to: 
i.Initialize room tariff and number of days using primitive data types and store them in 
wrapper objects. 
ii.Perform total bill calculation using unboxed primitive values. 
iii.Display the final hotel bill. */






public class lab2q1 {
    public static void main(String[] args){
        //Primitive values
        double tariff=2500; //Room charge per day
        int days=3;         //No. of days stayed
        double servicecharge=800;

        //Autoboxing - (Primitive to Wrapper Object automatically)
        Double roomtariff=tariff;
        Integer numberOfDays=days;
        Double extraCharges=servicecharge;

        //Unboxing - (Wrapper Object to primitive)
        double totalBill=roomtariff*numberOfDays+extraCharges;

        //Display bill
        System.out.println("Room Tariff per Day: " + roomtariff);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Service Charges: " + extraCharges);
        System.out.println("Total hotel bill: " + totalBill);
    }
}
