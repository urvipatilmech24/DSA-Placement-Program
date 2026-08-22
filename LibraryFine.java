import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice;

        do{
        System.out.print("Enter book name: ");
        String book = sc.nextLine();

        System.out.print("Enter Due Date: ");
        int due = sc.nextInt();

        System.out.print("Enter Return Date: ");
        int returnDays = sc.nextInt();

        int lateDays = returnDays - due;
        int fine = lateDays > 0 ? lateDays * 5 : 0;

        System.out.println("Book:"+book);
        System.out.println("Late days: "+lateDays);
        System.out.println("Fine: "+fine);

        System.out.print("\nProcess next book? (y/n): ");
        choice = sc.next().charAt(0);
        sc.nextLine();
        }while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}
