package classobj;

public class Main {
    
    public static void main(String[] args) {

        Animal an = new Tiger(); // tiger is having properties of animal as well Tiger
        an.walk();
        an.position(10.26, 6.35);
        // polymorphism

        Animal ct = new Cat();
        ct.walk();
        ct.blink();
        // ct.jump(); // it will allow you to call methods from referenced class

        Calculator cl = new Calculator(10,10);
        cl.addition();
        cl.subtraction();
        cl.multiplication();
    }
}
