import java.util.ArrayList;

public class BasicsTest{
    public static void main(String[] args){
        Basics basics = new Basics();
        basics.print1to255();
        basics.print1to255odd();
        basics.sum0to255();
        int[] arr = {1,3,5,7,9,13};
        basics.printIndex(arr);
        int[] max_arr = {-3, -5, -7};
        Integer max = basics.max(max_arr);
        System.out.println(max);
        int[] avg_arr = {2, 3, 10};
        Integer avg = basics.average(avg_arr);
        System.out.println(avg);
        ArrayList<Integer> y = basics.arr1to255();
        System.out.println(y);
        int[] y_arr = {1,3,5,7};
        Integer val = 3;
        Integer count = basics.greaterThanY(y_arr, val);
        System.out.println(count);
        int[] square_arr = {1, 5, 10, -2};
        square_arr = basics.squareArr(square_arr);
        System.out.println(square_arr);
    }
}