import java.util.Scanner;
public class Main{
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to put: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Enter " + i + " integer: ");
            array[i] = scanner.nextInt();
        }

        int max, min;
        max = array[1];
        min = array[1];

        for(int i = 0; i < n; i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(min > array[i]){
                min = array[i];
            }
        }

        System.out.println("Max is " + max);
        System.out.println("min is " + min);

        scanner.close();
    }
}