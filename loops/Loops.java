package loops;

public class Loops {
    public static void forDemo() {  // function definition
        int [] nums = {13, 89, 12, 96, 36};
           // init; condition; steps
        for(int i = 0; i < nums.length; i++){
            System.out.println(" Position "+ i + " Element "+nums[i]);
        }
        
    }

    public static void forColDemo() {
        int[] nums = { 13, 89, 12, 96, 36 };

        // element of array
        for (int el : nums) {
            System.out.println(" Element = " + el);
        }
    }

    public static void whileDemo() {

        int [] nums = { 13, 89, 12, 96, 36};
        int i = 0;
        while (i < nums.length){

            System.out.println(" Element = "+nums[i]);
            i++;
        }
    }

    public static void downWhileDemo(){

        int i = 0;
        int [] nums = {13, 89, 12, 96, 36};
        do {
            System.out.println(" Element = "+nums[i]);
            i++;
        } while (i < nums.length);
    }

    public static void main(String[] argc){
        System.out.println("..... Loops .......");
        //forColDemo();
        //forDemo();
        whileDemo();
        downWhileDemo();
    }
}
