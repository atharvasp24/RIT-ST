package activity;

public class Calculator {

    public static void Calculate(float x, float y){
        float sum = x + y;
        float mul = x * y;
        float sub = x - y;
        float div = x/ y;
        System.out.println("X = " + x + ", Y = " + y);
        System.out.println("x + y = "+ sum);
        System.out.println("x * y = " + mul);
        System.out.println("x - y = " + sub);
        System.out.println("x / y = "+ div);

    }
public static void main(String[] args){
    Calculate(3,4);
    Calculate(2,4.5f);
    Calculate(2.4f,5.4f);
}
}
