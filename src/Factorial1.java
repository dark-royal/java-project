import java.util.Scanner;

public class Factorial1 {

    public static void main(String[] args){

        Factorial1 factorial = new Factorial1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        factorial.calculateFactorial(number);
            factorial.calculateExponential(number);

    }

        public int calculateFactorial (int number){
            for (int index = number - 1; index >= 1; index--) {
                number *= index;
                System.out.println(number);
            }
            return number;
        }


        public int calculateExponential (int number){
            int factorial = 0;
            double exponential = 0.0;
            for (int count = 0; count <= number; count++) {
                factorial = calculateFactorial(count);
                exponential = 1.0 / factorial;
                System.out.println(exponential);
            }
            return (int) exponential;
        }
    }