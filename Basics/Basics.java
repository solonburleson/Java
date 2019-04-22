import java.util.ArrayList;

public class Basics{
    public Integer print1to255(){
        Integer i = 1;
        while(i <= 255){
            System.out.println(i);
            i++;
        }
        return i;
    }
    public Integer print1to255odd(){
        Integer i = 1;
        while(i <= 255){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
        return i;
    }
    public Integer sum0to255(){
        Integer i = 0;
        Integer sum = 0;
        while(i <= 255){
            sum += i;
            System.out.println("New Number: " + i + ", Sum: " + sum);
            i++;
        }
        return sum;
    }
    public int[] printIndex(int[] arr){
        for(Integer idx : arr){
            System.out.println(idx);
        }
        return arr;
    }
    public Integer max(int[] arr){
        Integer max = arr[0];
        for(Integer idx : arr){
            if(idx > max){
                max = idx;
            }
        }
        return max;
    }
    public Integer average(int[] arr){
        Integer sum = 0;
        Integer avg = 0;
        for(Integer idx : arr){
            sum += idx; 
        }
        avg = sum / arr.length;
        return avg;
    }
    public ArrayList<Integer> arr1to255(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        Integer i = 1;
        while(i <= 255){
            if(i % 2 != 0){
                y.add(i);
            }
            i++;
        }
        return y;
    }
    public Integer greaterThanY(int[] arr, Integer y){
        Integer count = 0;
        for(Integer idx : arr){
            if(idx > y){
                count++;
            }
        }
        return count;
    }
    public int[] squareArr(int[] arr){
        for(Integer idx : arr){
            idx = idx * idx;
        }
        return arr;
    }
}