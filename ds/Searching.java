package ds;


import java.util.Arrays;

public class Searching {


    public static int linearSearch(int sv) {
        int []arr = {61, 87, 86, 12, 27, 93, 57, 98, 80, 89, 81, 14, 85, 54, 81, 19, 30, 51, 58, 7, 100, 2, 53, 79, 36, 62, 33, 86, 0, 12, 20, 48, 20, 84, 58, 16, 66, 52, 37, 96, 19, 58, 98, 20, 54, 88, 73, 95, 81, 59};

        for( int i : arr) {
            if(sv == i)
                return i;
        }

        return -1;
    }


    public static void binarySearch(int sv) {
        int[] arr = {61, 87, 86, 12, 27, 93, 57, 98, 80, 89, 81, 14, 85, 54, 81, 19, 30, 51, 58, 7, 100, 2, 53, 79, 36, 62, 33, 86, 0, 12, 20, 48, 20, 84, 58, 16, 66, 52, 37, 96, 19, 58, 98, 20, 54, 88, 73, 95, 81, 59};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); //nlogn
        System.out.println(Arrays.toString(arr));

        int pos = Arrays.binarySearch(arr, sv); //log n

        System.out.println("Position is "+ pos);
    }

    public static void main(String[] args) {
        System.out.println(" Search Element "+ linearSearch(32));
        if(linearSearch(32) != -1) {
            System.out.println("Found The Element");
        }
        else {
            System.out.println("Element not found");
        }

        binarySearch(36);
    }
}
