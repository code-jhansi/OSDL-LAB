public class WrapperClassDemo {
    public static void main(String[] args){
        //Primitive Data types
        int a = 20;
        double b = 50.5;
        char c = 'S';
        boolean flag=true;

        //converting primitives to wrapper objects (Boxing)
        Integer intObj=Integer.valueOf(a);
        Double doubleObj=Double.valueOf(b);
        Character charObj=Character.valueOf(c);
        Boolean boolObj=Boolean.valueOf(flag);

        //Displaying wrapper objects
        System.out.println("Wrapper Objects:");
        System.out.println("Integer Object :" + intObj);
        System.out.println("Double Object :" + doubleObj);
        System.out.println("Character Object :" + charObj);
        System.out.println("Boolean Object :" + boolObj);

        //converting wrapper objects to primitives (unboxing)
        int x = intObj.intValue();
        double y = doubleObj.doubleValue();
        char z=charObj.charValue();
        boolean status=boolObj.booleanValue();

        //Displaying primitive values after unboxing
        System.out.println("\nPrimitive Values After Unboxing:");
        System.out.println("int values :"+ x);
        System.out.println("Double value :"+ y);
        System.out.println("char value: "+ z);
        System.out.println("boolean value: "+ status);
    }
}
