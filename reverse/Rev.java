package reverse;

public class Rev {
    
    // public static void swap(int a, int b) {
    //     int temp;
    //     temp = a;
    //     a = b;
    //     b = temp;
    // }

    // public static void reverse(int a,int b, int c, int d) {
        // swap(a,d);
        // swap(b,c);
        
       //  a=a+d;
       //  d=a-d;
        // a=a-d;
        // b=b+c;
       //  c=b-c;
        // b=b-c;
        
        // System.out.println("Value of a b c d are respectively "+a+","+b+","+c+","+d);
    // }


    public static void stringRev() {

        String a = "android";
        String b = "ios";
        String c = "linux";
        String d = "windows";

        String temp;
        temp = a;
        a = d;
        d = temp;
        temp = c;
        c = b;
        b = temp;
        System.out.println(a+"  "+b+"  "+c+"  "+d);
    }
    public static void main(String[] args) {
        

        stringRev();
        
    }
}
