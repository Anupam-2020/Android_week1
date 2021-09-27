package classobj;

public class Calculator {
    
    private int num1; // state -> filed -> properties -> data
    private int  num2;

    // special function = constructor.
    public  Calculator(int x, int y) { // used to inilize the state at the time of object creation
        
        num1 = x;
        num2 = y;
    }

    public void addition() {
        System.out.println("Addition of two nos. is " + (num1 + num2));
    }

    public void subtraction() {
        System.out.println("Subs. of Two nos. is " +(num1 - num2));
    }

    public void multiplication() {
        System.out.println("Multiplication of two nos. is "+(num1*num2));
        
    }
}
