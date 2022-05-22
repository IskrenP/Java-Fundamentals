import java.util.Scanner;

public class Orders {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       int number = Integer.parseInt(input.nextLine());

       double pricePerCaps = 0.0f;
       int days = 0;
       int capsCount = 0;

       double total = 0.0;
       double orderPrice = 0.0;

       for (int i = 0; i < number; i++) {
           pricePerCaps = Double.parseDouble(input.nextLine());
           days = Integer.parseInt(input.nextLine());
           capsCount = Integer.parseInt(input.nextLine());
         
           orderPrice = ((days * capsCount) * pricePerCaps);
           total += orderPrice;

         System.out.printf("The price for the coffee is: $%.2f\n", orderPrice);
       }

       System.out.printf("Total: $%.2f", total);
   }
}