//Enum - a fixed set of named constants (it can also behave like variables,constructor,methods)
//Ex:Months,Directions,Grades

enum Days{
    MONDAY,TUESDAY,WEDNESDAY,
    THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class EnumDemo{
    public static void main(String[] args){
        //Using enum
        Days today = Days.SATURDAY;
        System.out.println("Today is:" +today);

        //Using enum in switch statement
        switch(today){
            case MONDAY:
                System.out.println("Strat of the week");
                break;
            case FRIDAY:
                System.out.println("Almost weekend");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Midweek day");
        }
        //Iterating through enum values
        System.out.println("\nAll Days:");
        for(Days d:Days.values()){
            System.out.println(d);
        }
    }
}
