import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sumOfDigits =0;
            
            while (num>0){
                sumOfDigits+=num%10;
                num=num/10;
            }
            if(sumOfDigits==5||sumOfDigits==7||sumOfDigits==11){
                System.out.println(i+" -> True");
            }else{
                System.out.println(i+" -> False");
            }
        }

    }
}