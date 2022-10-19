package FloatAndDouble;

public class Main {
    public static void main(String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min. value = "+myMinFloatValue);
        System.out.println("Float max. value = "+myMaxFloatValue);

        float myMinDoubleValue = Float.MIN_VALUE;
        float myMaxDoubleValue = Float.MAX_VALUE;
        System.out.println("Float min. value = "+myMinDoubleValue);
        System.out.println("Float max. value = "+myMaxDoubleValue);

        int myIntValue  =5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue =5d / 3d;
        System.out.println("MyFloatValue = "+myFloatValue);
        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("MyDoubleValue = "+myDoubleValue);
    }
}
