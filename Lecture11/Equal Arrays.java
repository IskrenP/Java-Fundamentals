import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String first = scanner.nextLine();

        String[]firstLine = first.split(" ");
        int[] firstNumbers = new int[firstLine.length];
        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] = Integer.parseInt(firstLine[i]);
        }
        String second = scanner.nextLine();
        String[]secondLine = second.split(" ");
        int[] secondNumbers = new int[secondLine.length];
        for (int i = 0; i < secondNumbers.length ; i++) {
            secondNumbers[i] = Integer.parseInt(secondLine[i]);
        }
        

        boolean areEqual = true;
        int difIndex =-1;          
    if(firstNumbers.length== secondNumbers.length){
        for (int i = 0; i < firstNumbers.length ; i++) {
            if (firstNumbers[i] != secondNumbers[i]) {
                
                areEqual = false;
                difIndex = i;
                break;
            }
        }
    }else{
        areEqual=false;
    }
    if(areEqual){  
        int sum =0;
        for (int number: firstNumbers) {
            sum+=number;
        }
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }else{
        System.out.printf("Arrays are not identical. Found difference at %d index.",difIndex);
    }

    }
}