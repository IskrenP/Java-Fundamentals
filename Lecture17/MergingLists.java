package L05Lists.Lab.T03MergingLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultingList = new ArrayList<>();

        while (firstList.size() > 0 && secondList.size() > 0) {
            resultingList.add(firstList.get(0));
            firstList.remove(0);
            resultingList.add(secondList.get(0));
            secondList.remove(0);
        }
        resultingList.addAll(firstList);
        resultingList.addAll(secondList);

        for (Integer e : resultingList) {
            System.out.printf("%d ", e);
        }
    }
}