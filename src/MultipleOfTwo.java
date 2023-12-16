import java.util.Scanner;

public class MultipleOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to be multiply by 2: ");
        int number = scanner.nextInt();

        int count = 1;
        int two = 2;

        while (true){
            int isTwo = count * two;
            System.out.println("Multiplying by: "+ isTwo);
            count++;
        }


    }
}
