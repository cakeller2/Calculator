import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //sets up scanner

        System.out.println("Please enter two whole numbers\nFirst number?");
        int firstNum = input.nextInt(); //saves input of first num

        System.out.println("Second number?");
        int secNum = input.nextInt(); //saves input of second num

        System.out.println(firstNum + " added with " + secNum + " equals " + (firstNum + secNum));

    }
}

/*Ask the user to enter in two whole numbers, and then print out the result of the two
numbers added together.*/