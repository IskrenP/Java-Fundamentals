import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        String winner = "";
        double currVolume = 0.00;

        for (int i = 0; i < numberOfKegs; i++) {
            String nameOfBrand = scanner.nextLine();
            double rad = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double volume = Math.PI * Math.pow(rad, 2) * height;

            if (volume > currVolume) {
                currVolume = volume;
                winner = nameOfBrand;
            }
        }
        System.out.println(winner);
    }
}