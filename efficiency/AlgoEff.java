package efficiency;

public class AlgoEff {

    public static void constantTime() {

        for(int i=0;i < 100; i++) {
            System.out.println(i+".Checking Constant Time"); // n=100
        } // o(n) = o(100) = 0(1)
    }


    public static void logarithmicTime(int n) {
        for(int i = 1; i < n; i *= 2) {  // i = i * 2 = 2
            System.out.println(i +".Checking Logarithmic Time");
        }
    } // o(n) = O(log n)



    public static void linearTime(int n) {  // n = 100
        for(int i = 0; i < n; i++){ // n
            System.out.println(i+".Linear Time"); // n
        } // o(n) = n = O(n)
    }


    public static void linearithmic(int n) {
        for(int i = 1; i < n; i++){  // O(n)
            for(int j = 1; j < n; j *=2){  //O(log n)
                System.out.println(" i = "+ i + " j = "+ j);
            }
        }  // O(n log n)
    }


    public static void quadratic(int n) {
        for(int i = 1; i < n; i++) {  // n
            
            for( int j = 1; j < n; j++) {
                System.out.println(" i = "+ i + " j = "+ j);
            }
        }   // o(n) = n * n = n2 = O(n2) -> bad 
        
    }

    public static void exponential(int n) {
        for( int i = 0; i< Math.pow(2,n);i++){
            System.out.println(i+" .Exponential");
        } // o(n) = 2 ^ n = O(2 ^ n) -> bad.
    }



    public static void main(String[] args) {
        // System.out.println();
        //constantTime();
        // logarithmicTime(100);
        // linearTime(1000);
        // linearithmic(100);
        // quadratic(10);
        // exponential(4);
    }

}