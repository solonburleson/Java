import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzles{
    public ArrayList<Integer> first(int[] arr){
        ArrayList<Integer> returnArr = new ArrayList<Integer>();
        Integer sum = 0;
        for(Integer i : arr){
            sum += i;
            if(i > 10){
                returnArr.add(i);
            }
        }
        System.out.println(sum);
        return returnArr;
    }
    public ArrayList<String> second(ArrayList<String> arr){
        ArrayList<String> returnArr = new ArrayList<String>();
        Collections.shuffle(arr);
        for(String i : arr){
            System.out.println(i);
            if(i.length() > 5){
                returnArr.add(i);
            }
        }
        return returnArr;
    }
    public ArrayList<String> third(ArrayList<String> arr){
        Collections.shuffle(arr);
        String first = arr.get(0);
        String last = arr.get(arr.size()-1);
        System.out.println(last);
        if(first == "a" || first == "e" || first == "i" || first == "o" || first == "u"){
            System.out.println("First index is a vowel");
        } else {
            System.out.println(first);
        }
        return arr;
    }
    public ArrayList<Integer> fourth(Integer lower, Integer upper){
        ArrayList<Integer> returnArr = new ArrayList<Integer>();
        Random r = new Random();
        Integer diff = upper - lower;
        while(returnArr.size() < 10){
            returnArr.add(r.nextInt(diff)+lower);
        }
        return returnArr;
    }
    public ArrayList<Integer> fifth(Integer lower, Integer upper){
        ArrayList<Integer> returnArr = new ArrayList<Integer>();
        Random r = new Random();
        Integer diff = upper - lower;
        while(returnArr.size() < 10){
            returnArr.add(r.nextInt(diff)+lower);
        }
        Collections.sort(returnArr);
        for(Integer i : returnArr){
            System.out.println(i);
        }
        System.out.println("Minimum: " + Collections.min(returnArr));
        System.out.println("Maximum: " + Collections.max(returnArr));
        return returnArr;
    }
    public String sixth(Integer length){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        String str = "";
        while(str.length() < length){
            str += alpha.charAt(r.nextInt(alpha.length()));
        }
        return str;
    }
    public ArrayList<String> seventh(Integer strLength, Integer arrLength){
        ArrayList<String> returnArr = new ArrayList<String>();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        String str = "";
        while(returnArr.size() < arrLength){
            str += alpha.charAt(r.nextInt(alpha.length()));
            if(str.length() == strLength){
                returnArr.add(str);
                str = "";
            }
        }
        return returnArr;
    }
}