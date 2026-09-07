import java.util.Scanner;
import java.lang.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Numbers Before Swap");
        int temp = a;
        a=b;
        b = temp;
        System.out.println("Numbers After Swap");
        sc.close();
    } 
    
}
