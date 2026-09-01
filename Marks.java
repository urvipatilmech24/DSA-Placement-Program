import java.util.Scanner;

public class Marks {
        String name;
        int total,m1,m2,m3,m4;

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.next();

        System.out.println("Enter Marks for AI: ");
        int m1 = sc.nextInt();

        System.out.println("Enter Marks for DSA: ");
        int m2 = sc.nextInt();

        System.out.println("Enter Marks for OOPs: ");
        int m3 = sc.nextInt();

        int total = m1+m2+m3;   
        float avg = total/3.0f;
        
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        sc.close();
    }
}
