import java.util.*;

public class PayrollManagement {
    public static double calculateBasicSalary(String type, int hoursWorked){
        double rate;
        if(type.equalsIgnoreCase("FullTime")){
            rate = 500;
        }else if(type.equalsIgnoreCase("PartTime")){
            rate =250;
        }else if (type.equalsIgnoreCase("Contarct")){
            rate = 350;
        }else{
            System.err.println("Invalid Employee Type");
            return 0;
        }
        return rate*hoursWorked;
    }

    public static double calculateBasicSalary(int hoursWorked){
        double rate = 300;
        return rate*hoursWorked;
    }

    public static double calculateHR(double basic){
        return basic*0.20;
    }

    public static double calculateDA(double basic){
        return basic*0.15;
    }

    public static double calculatePF(double basic){
        return basic*0.12;
    }

    public static double calculateTax(double gross){
        if(gross<50000){
            return 0 ;
        }else if(gross>50000 && gross<100000){
            return gross*0.10;
        }else {
            return gross*0.20;
        }
    }

    public static double calculateNetSalary(double gross,double tax, double pf){
        return gross-tax-pf;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Type (PartTime,Fulltime,contarct): ");
        String type = sc.nextLine();

        System.out.println("Enter Hours Worked: ");
        int hoursWorked = sc.nextInt();

        double basic = calculateBasicSalary(type,hoursWorked);
        double hra = calculateHR(basic);
        double da = calculateDA(basic);
        double pf = calculatePF(basic);

        double gross = basic + hra + da ;
        double tax = calculateTax(gross);
        double netSalary = calculateNetSalary(gross,tax,pf);

        System.out.println("Employee Type: "+type);
        System.out.println("Hours Worked: "+hoursWorked);
        System.out.printf("Basic Salary: %2f%n",basic);
        System.out.printf("HRA: %2f%n",hra);
        System.out.printf("DA: %2f%n",da);
        System.out.printf("Gross Salary: %2f%n",gross);
        System.out.printf("PF: %2f%n",pf);
        System.out.printf("Tax: %2f%n",tax);
        System.out.printf("Net Salary: %2f%n",netSalary);

        sc.close();
    }
}
