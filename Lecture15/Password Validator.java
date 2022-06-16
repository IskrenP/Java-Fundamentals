import java.util.Locale;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (passLenghtValidator(password) && isConsistOnlyLettersAndDigits(password) && isHaveAtLeast2Digits(password)) {
            System.out.println("Password is valid");

        }
        if (!passLenghtValidator(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isConsistOnlyLettersAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isHaveAtLeast2Digits(password)){
            System.out.println("Password must have at least 2 digits");
        }



    }
    public static boolean passLenghtValidator(String password) {
        return password.length() >= 6 && password.length() <= 10;

    }

    public static boolean isConsistOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++){
            char symbol = password.toLowerCase().charAt(i);
            if ( (symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)){
                return false;

            }
        }
        return true;
    }


    public static boolean isHaveAtLeast2Digits(String password) {
        int count = 0;
        for (int i = 0; i <password.length(); i++){
            char symbol = password.charAt(i);
            if ( (symbol >= 48 &&  symbol <= 57) ){
                count++;


            }
        }
        return count >= 2;

    }
}