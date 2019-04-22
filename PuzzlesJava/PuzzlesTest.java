import java.util.ArrayList;

public class PuzzlesTest{
    public static void main(String args[]){
        Puzzles puzzles = new Puzzles();
        int[] first_arr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> first = puzzles.first(first_arr);
        System.out.println(first);
        ArrayList<String> second_arr = new ArrayList<String>();
        second_arr.add("Nancy");
        second_arr.add("Jinichi");
        second_arr.add("Fujibayashi");
        second_arr.add("Momochi");
        second_arr.add("Ishikawa");
        ArrayList<String> second = puzzles.second(second_arr);
        System.out.println(second);
        ArrayList<String> third_arr = new ArrayList<String>();
        third_arr.add("a");
        third_arr.add("b");
        third_arr.add("c");
        third_arr.add("d");
        third_arr.add("e");
        third_arr.add("f");
        third_arr.add("g");
        third_arr.add("h");
        third_arr.add("i");
        third_arr.add("j");
        third_arr.add("k");
        third_arr.add("l");
        third_arr.add("m");
        third_arr.add("n");
        third_arr.add("o");
        third_arr.add("p");
        third_arr.add("q");
        third_arr.add("r");
        third_arr.add("s");
        third_arr.add("t");
        third_arr.add("u");
        third_arr.add("v");
        third_arr.add("w");
        third_arr.add("x");
        third_arr.add("y");
        third_arr.add("z");
        ArrayList<String> third = puzzles.third(third_arr);
        System.out.println(third);
        ArrayList<Integer> fourth = puzzles.fourth(55,100);
        System.out.println(fourth);
        ArrayList<Integer> fifth = puzzles.fifth(55,100);
        System.out.println(fifth);
        String sixth = puzzles.sixth(5);
        System.out.println(sixth);
        ArrayList<String> seventh = puzzles.seventh(5,10);
        System.out.println(seventh);
    }
}