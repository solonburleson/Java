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
        int[] squareArr = {1,5,10,-2};
        ArrayList<Integer> squaredArr = basics.squareArr(squareArr);
        System.out.println(squaredArr);
        int[] orig = {1,5,10,-2};
        ArrayList<Integer> noNeg = basics.noNeg(orig);
        System.out.println(noNeg);
        ArrayList<Integer> maxMinAvg = basics.maxMinAvg(orig);
        System.out.println(maxMinAvg);
        int[] arrShift = {1,5,7,10,-2};
        ArrayList<Integer> shifted = basics.shiftArr(arrShift);
        System.out.println(shifted);
    }
}