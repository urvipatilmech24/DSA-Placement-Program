import java.util.*;

public class CommerceShipping {
    public static double calculateShipping(double weight){
        return 50+ weight*10;
    }

    public static double calculateShipping(double weight,int distance){
        return 50 + weight*10 + distance*2;
    }

    public static double calculateShipping(double weight,double distance,boolean isExpress){
        if(isExpress){
            return 50 + weight*10 + distance*2 +100;
        }else{
            return 50+ weight*10 + distance*2;
        }
    }

    public static int calculatecartTotal(double[] itemPrice){
        double sum = 0;
        for (int i = 0; i<itemPrice.length; i++){
            sum = sum +itemPrice[i];
        }
        return (int) sum;
    }

    public static int applyCoupen(double total,String name){
        int discount = 0;
        if(name.equals("SAVE10")){
            discount = (int)(total*10/100);
            System.out.println("Coupen is applied");
        }else{
            System.out.println("Coupen is not Applied");
        }
        return discount;
    }

    public static int generateInvoice(double weight,int distance,boolean isExpress,double[] itemPrice,String name){
        int a = (int) calculateShipping(weight,distance,isExpress);
        int b = calculatecartTotal(itemPrice);
        int c = applyCoupen(b, name);
        return a+b-c;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Weight is : ");
        double weight = sc . nextDouble();

        System.out.println("Distance is : ");
        int distance = sc . nextInt();

        System.out.println("Enter number of items: ");
        int n = sc.nextInt();
        System.out.print("Express Delivery? (true/false): ");
        boolean isExpress = sc.nextBoolean();

        double[] itemPrice = new double[n];
        System.out.println("Enter Item Prices: ");

        for (int i =0;i<n;i++){
            itemPrice[i] = sc.nextDouble();
        }

        System.err.println("Enter Coupen Name: ");
        String coupenName = sc.next();

        int invoice = generateInvoice(weight,distance,isExpress,itemPrice,coupenName);
        System.out.println("Final Invoice = "+ invoice);
    }
}
