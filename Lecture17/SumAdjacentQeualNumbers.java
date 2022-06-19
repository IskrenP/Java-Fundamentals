package L05Lists.Lab.T01SumAdjacentEqualNumbers;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int i = 0;
        while (i < numbers.size() - 1) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = 0;
                continue;
            }
            i++;
        }
        System.out.println(joinElementsByDelimiter(numbers," "));
    }

    private static String joinElementsByDelimiter(List<Double> list, String delimiter) {
        String output = "";

        for (Double element : list) {
            output += (new DecimalFormat("0.#").format(element)) + delimiter;
        }
        return output;
    }
}