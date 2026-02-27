import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int a = n;
        int reverse = 0;
        int remainer;

        while(n != 0){
            remainer = n%10;
            reverse = reverse*10 + remainer;
            n = n/10;
        }
        System.out.println("The number is " + a);
        System.out.println("Reverse is " + reverse);
        scanner.close();
    }
}