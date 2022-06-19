package L05Lists.Lab.T02GaussTrick;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int halfSize = list.size() / 2;
        for (int i = 0; i < halfSize ; i++) {
            list.set(i, list.get(i) + list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }

        for (Integer e : list)
            System.out.printf("%d ", e);
    }
}