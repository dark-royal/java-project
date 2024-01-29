
import java.util.Scanner;
public class Asterisks1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++) {
            for(int j = number; j >= 1; j-- ){
                for(int count = j; count <= 1; count++){
                    System.out.print("*");
                System.out.println(" ");
            System.out.println();

                }
            }
        }
    }

}
