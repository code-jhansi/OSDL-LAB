public class AutoboxingUnboxingDemo {
    public static void main(String[] args){
        //Autoboxing - Primitive to Wrapper Object
        int num = 50;
        Integer intObj=num; //Autoboxing
        System.out.println("Primitive Value: "+ num);
        System.out.println("Wrapper Object: "+ intObj);
        //Unboxing - Wrapper Object to Primitive
        Integer Obj=100;
        int value=Obj; //Unboxing
        System.out.println("Wrapper Object: "+ Obj);
        System.out.println("Primitive Object: "+ value);



    }
    
}
