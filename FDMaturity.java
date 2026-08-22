import java.util.Scanner;

public class FDMaturity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.println("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.println("Enter tenure (in yeras): ");
        int years = sc. nextInt();

        double maturityAmount = principal;

        for(int i = 1; i<=years; i++){
            maturityAmount = maturityAmount + (maturityAmount*rate/100);
        }
        double interest = maturityAmount - principal;

        System.out.println("Principal Amount: "+principal);
        System.out.println("Rate of Interest: "+rate);
        System.out.println("Time: "+years);
        System.out.println("Interest Earned: "+interest);
        System.out.println("Maturity Amount: "+maturityAmount);
    }
}