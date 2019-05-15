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
    public ArrayList<Integer> squareArr(int[] arr){
        ArrayList<Integer> new_arr = new ArrayList<Integer>();
        for(Integer idx : arr){
            new_arr.add(idx*idx);
        }
        return new_arr;
    }
    public ArrayList<Integer> noNeg(int[] arr){
        ArrayList<Integer> new_arr = new ArrayList<Integer>();
        for(Integer idx : arr){
            if(idx > 0){
                new_arr.add(idx);
            } else {
                new_arr.add(0);
            }
        }
        return new_arr;
    }
    public ArrayList<Integer> maxMinAvg(int[] arr){
        ArrayList<Integer> new_arr = new ArrayList<Integer>();
        Integer max = arr[0];
        Integer min = arr[0];
        Integer sum = 0;
        for(Integer idx : arr){
            if(idx > max){
                max = idx;
            } else if(idx < min) {
                min = idx;
            }
            sum += idx;
        }
        new_arr.add(max);
        new_arr.add(min);
        new_arr.add(sum/arr.length);
        return new_arr;
    }
    public ArrayList<Integer> shiftArr(int[] arr){
        ArrayList<Integer> new_arr = new ArrayList<Integer>();
        for(Integer idx = 1; idx < arr.length; idx++){
            new_arr.add(arr[idx]);
        }
        new_arr.add(0);
        return new_arr;
    }
}