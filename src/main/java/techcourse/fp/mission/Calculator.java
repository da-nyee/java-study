package techcourse.fp.mission;

import java.util.List;
import java.util.function.IntPredicate;

public class Calculator {
    public static int sumAll(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int sumAll(List<Integer> numbers, IntPredicate condition) {
        int total = 0;
        for (int number : numbers) {
            if (condition.test(number)) {
                total += number;
            }
        }
        return total;
    }

    public static int sumAllEven(List<Integer> numbers) {
        return sumAll(numbers, i -> i % 2 == 0);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return sumAll(numbers, i -> i > 3);
    }
}
