import java.util.Scanner;
public class Main{
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to put: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for(int i = 1; i <= n; i++){
            String ordinal = "";
            if(i == 1)
                ordinal = "st";
            else if(i == 2)
                ordinal = "nd";
            else if(i == 3)
                ordinal = "rd";
            else 
                ordinal = "th";
            System.out.print("Enter " + i + ordinal + " integer: ");
            array[i-1] = scanner.nextInt();
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