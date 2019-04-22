public class FizzBuzzTest{
    public static void main(String[] args){
        FizzBuzz iD = new FizzBuzz();
        String fizz = iD.fizzBuzz(3);
        System.out.println(fizz);
        fizz = iD.fizzBuzz(5);
        System.out.println(fizz);
        fizz = iD.fizzBuzz(15);
        System.out.println(fizz);
        fizz = iD.fizzBuzz(2);
        System.out.println(fizz);
    }
}