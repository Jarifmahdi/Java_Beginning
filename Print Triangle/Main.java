import java.util.Scanner;
public class Main{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int i, j;
        
        for(i=1; i<=n; i++){
            for(j=n; j>=1; j--){
                if(j<=i){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
                
            }
        System.out.println();
    }
    
        scanner.close();        
    }
}