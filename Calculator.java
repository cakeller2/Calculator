import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //sets up scanner

        System.out.println("Please enter two numbers\nFirst number?");
        double firstNum = input.nextDouble(); //saves input of first num

        System.out.println("Second number?");
        double secNum = input.nextDouble(); //saves input of second num

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
            if (secNum == 0) {
                System.out.println("Error: Divide by Zero");
            } else {
                System.out.println(firstNum + " divided with " + secNum + " equals " + (firstNum / secNum));
            }
        } else {
            System.out.println("That was not a valid entry, goodbye"); //if user hits wrong button

        }

    }
}