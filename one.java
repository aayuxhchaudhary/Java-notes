import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        System.out.print("Enter a value = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        
        sc.close();
    }
}