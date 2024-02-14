import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //sets up scanner

        System.out.println("Please enter two whole numbers\nFirst number?");
        int firstNum = input.nextInt(); //saves input of first num

        System.out.println("Second number?");
        int secNum = input.nextInt(); //saves input of second num

        System.out.println("Please choose if you would like to add or subtract your numbers.\ntype \"a\" to add, \"s\" to subtract, \"m\" to multiply, or \"d\" to divide");
        input.nextLine();
        String addOrSub = input.next();//saves operation input

        if (addOrSub.equals("a") || addOrSub.equals("A")) {
            System.out.println(firstNum + " added with " + secNum + " equals " + (firstNum + secNum)); //add numbers
        } else if (addOrSub.equals("s") || addOrSub.equals("S")) {
            System.out.println(firstNum + " subtracted with " + secNum + " equals " + (firstNum - secNum)); //subtracts numbers
        } else if (addOrSub.equals("m") || addOrSub.equals("M")) {
            System.out.println(firstNum + " multiplied with " + secNum + " equals " + (firstNum * secNum));
        } else if (addOrSub.equals("d") || addOrSub.equals("D")) {
            System.out.println(firstNum + " divided with " + secNum + " equals " + (firstNum / secNum));
        } else {
            System.out.println("That was not a valid entry, goodbye"); //if user hits wrong button

        }

    }
}